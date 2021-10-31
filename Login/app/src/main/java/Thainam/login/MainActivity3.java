package Thainam.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.GridLayoutAnimationController;
import android.widget.Button;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private RecyclerView recyclerViewVideo;
    private VideoAdapter videoAdapter;
    private Button btnGetVideo;
    private List<Video> mListVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerViewVideo = findViewById(R.id.rcv_video);
        btnGetVideo = findViewById(R.id.btn_get_video);
        videoAdapter= new VideoAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerViewVideo.setLayoutManager(gridLayoutManager);
        btnGetVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    checkPermission();
            }
        });
    }

    private void checkPermission() {
        PermissionListener permissionlistener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {

                getAllVideoFromGallery();
            }

            @Override
            public void onPermissionDenied(List<String> deniedPermissions) {
                Toast.makeText(MainActivity3.this, "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
            }


        };

        TedPermission.with(this)
                .setPermissionListener(permissionlistener)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .check();
    }

    private void getAllVideoFromGallery() {
        mListVideo = new ArrayList<>();
        Uri uri;
        Cursor cursor;

        int columIndexData,thumb;
         String absolutePathOfImage= null;
         String thumbnail = null;
         uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
         String[] projection = {MediaStore.MediaColumns.DATA,MediaStore.Video.Media.BUCKET_DISPLAY_NAME,
         MediaStore.Video.Media._ID,MediaStore.Video.Thumbnails.DATA};

         final String orderBy = MediaStore.Images.Media.DATE_TAKEN;
         cursor =getApplicationContext().getContentResolver().query(uri,projection,null,null,orderBy+ " DESC");

         columIndexData = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);
         thumb = cursor.getColumnIndexOrThrow(MediaStore.Video.Thumbnails.DATA);

         while (cursor.moveToNext()){
             absolutePathOfImage = cursor.getString(columIndexData);
             thumbnail = cursor.getString(thumb);

             Video video = new Video();
             video.setPath(absolutePathOfImage);
             video.setThumb(thumbnail);

             mListVideo.add(video);
         }
         videoAdapter.setData(mListVideo);
         recyclerViewVideo.setAdapter(videoAdapter);

    }
}
package Thainam.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class EnjoyYoutube extends AppCompatActivity {

    public static String API_KEY ="AIzaSyAncGZzXU9SZflYdVma2gQDnF1xK4Ok3Pc";
    String ID_PLAYLIST ="PLsNzT1Ey5BHz_svbuBDMOJNICa-_xm6wW";
    String urlGetJson = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId="+ID_PLAYLIST+"&key="+API_KEY+"&maxResults=50";

    ListView lvVideo;
    ArrayList<VideoYoutube> arrayVideo;
    VideoYoutubeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enjoy_youtube);
        lvVideo = findViewById(R.id.listviewVideo);
        arrayVideo = new ArrayList<>();
        adapter = new VideoYoutubeAdapter(this,R.layout.row_video_youtube,arrayVideo);
        lvVideo.setAdapter(adapter);

        GetJsonYoutube(urlGetJson);

        lvVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(EnjoyYoutube.this,PlayVideoActivity.class);
                intent.putExtra("idVideoTouTube",arrayVideo.get(i).getIdVideo());
                startActivity(intent);


            }
        });

    }
    private void GetJsonYoutube(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray jsonItems = response.getJSONArray("items");
                            String title = "";
                            String url = "";
                            String idVideo = "";
                            for(int i =0;i<jsonItems.length();i++){
                                JSONObject jsonItem = jsonItems.getJSONObject(i);
                                JSONObject jsonSippet = jsonItem.getJSONObject("snippet");
                                title= jsonSippet.getString("title");
                                JSONObject jsonThumbnail = jsonSippet.getJSONObject("thumbnails");
                                JSONObject jsonMedium = jsonThumbnail.getJSONObject("medium");
                                url = jsonMedium.getString("url");
                                JSONObject jsonResourceID = jsonSippet.getJSONObject("resourceId");
                                idVideo = jsonResourceID.getString("videoId");

                                arrayVideo.add(new VideoYoutube(title,url,idVideo));

                            }
                            adapter.notifyDataSetChanged();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(EnjoyYoutube.this,"Loi",Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);

    }

}
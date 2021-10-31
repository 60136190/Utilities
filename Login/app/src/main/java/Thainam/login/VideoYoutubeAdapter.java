package Thainam.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class VideoYoutubeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<VideoYoutube> videoYoutubeList;

    public VideoYoutubeAdapter(Context context, int layout, List<VideoYoutube> videoYoutubeList) {
        this.context = context;
        this.layout = layout;
        this.videoYoutubeList = videoYoutubeList;
    }

    @Override
    public int getCount() {
        return videoYoutubeList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgThumbnail;
        TextView txttitle;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txttitle=view.findViewById(R.id.textviewTitle);
            holder.imgThumbnail = view.findViewById(R.id.imageviewThumbnail);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        VideoYoutube video = videoYoutubeList.get(i);
        holder.txttitle.setText(video.getTitle());
        Picasso.with(context).load(video.getThumbnail()).into(holder.imgThumbnail);
        return view;
    }
}

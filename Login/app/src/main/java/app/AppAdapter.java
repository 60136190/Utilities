package app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Thainam.login.R;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder>{
    private List<App> mApp;
    public void setData(List<App> list){
        this.mApp = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_application,parent,false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        App app = mApp.get(position);
        if(app == null){
            return;
        }
        holder.imgApp.setImageResource(app.getResourceId());
        holder.tvTitle.setText(app.getTitle());

    }

    @Override
    public int getItemCount() {
        if(mApp!=null){
            return mApp.size();
        }
        return 0;
    }

    public class AppViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgApp;
        private TextView tvTitle;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);

            imgApp = itemView.findViewById(R.id.img_app);
            tvTitle = itemView.findViewById(R.id.tv_title);

        }   
    }
}

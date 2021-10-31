package Thainam.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserCookingAdapter extends RecyclerView.Adapter<UserCookingAdapter.UserViewHolder>{
    private Context mContext;
    private List<UserCooking> mListUser;

    public UserCookingAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<UserCooking>list){
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cooking,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserCooking userCooking = mListUser.get(position);
        if(userCooking == null){
            return;
        }
        holder.imgUser.setImageResource(userCooking.getResourceImage());
        holder.tvName.setText(userCooking.getName());
//        holder.tvdetail.setText(userCooking.getDetail());

        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickgotoDetail(userCooking);
            }
        });

    }

    private void onClickgotoDetail(UserCooking userCooking) {
        Intent intent = new Intent(mContext,DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object",userCooking);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if(mListUser != null){
            return mListUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgUser;
        private TextView tvName;
        private TextView tvdetail;
        private LinearLayout layoutItem;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);

            imgUser = itemView.findViewById(R.id.img_cooking);
            tvName = itemView.findViewById(R.id.tv_name);
            tvdetail = itemView.findViewById(R.id.tv_detail);

        }
    }
}

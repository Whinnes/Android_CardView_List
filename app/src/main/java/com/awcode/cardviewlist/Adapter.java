package com.awcode.cardviewlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context mContext;
    List<item> mData;

    public Adapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item, viewGroup, false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder myViewHolder, int i) {

        myViewHolder.background_img.setImageResource(mData.get(i).getBackground());
        myViewHolder.profile_photo.setImageResource(mData.get(i).getProfilePhoto());
        myViewHolder.tv_title.setText(mData.get(i).getProfileName());
        myViewHolder.tv_nbFollowers.setText(mData.get(i).getNbFollowers() + " Followers");

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_photo, background_img;
        TextView tv_title, tv_nbFollowers;

        public myViewHolder(View itemView) {
            super(itemView);
            profile_photo = itemView.findViewById(R.id.profile_img);
            background_img = itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_nbFollowers = itemView.findViewById(R.id.card_nb_followers);

        }
    }
}

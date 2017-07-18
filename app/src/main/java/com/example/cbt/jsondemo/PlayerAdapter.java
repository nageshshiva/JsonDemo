package com.example.cbt.jsondemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CBT on 18-07-2017.
 */

public class PlayerAdapter extends RecyclerView.Adapter {

    Context ctx;
    public PlayerAdapter(Context ctx)
    {
     this.ctx=ctx;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
       //Converting row.xml to java object
        View v1=LayoutInflater.from(ctx).inflate(R.layout.row,null,false);
        PlayerViewHolder pv=new PlayerViewHolder(v1);
        return pv;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class PlayerViewHolder extends RecyclerView.ViewHolder

    {
        ImageView playerImage;
        TextView playerName,playerRuns;
        public PlayerViewHolder(View itemView) {
            super(itemView);
            playerImage=(ImageView)itemView.findViewById(R.id.row_playerimg_iv);
            playerName=(TextView)itemView.findViewById(R.id.row_playername_tv);
            playerRuns=(TextView)itemView.findViewById(R.id.row_playerruns_tv);
        }
    }
}
package com.example.evaneos.tp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.evaneos.tp.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Evaneos on 06/05/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private Picasso picasso;
    private final String baseUrl;
    private final String[] data;

    public MyAdapter(Context context, String baseUrl, String[] data) {
        this.context = context;
        this.picasso = Picasso.with(context);
        this.baseUrl = baseUrl;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_layout, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        myViewHolder.refreshView(picasso, baseUrl, data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;
        private ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.text);
            iv = (ImageView) itemView.findViewById(R.id.image);
        }

        public void refreshView(Picasso picasso, String baseUrl, String s) {
            tv.setText(s);
            picasso.load(baseUrl + s).into(iv);
        }
    }
}

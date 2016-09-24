package com.chenhao.practice;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by chenhao on 2016/9/22.
 */
public class MyAdapter extends BaseAdapter {

    private Context mContext;
    private Handler mHandler = new Handler();

    public MyAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View contextView, ViewGroup viewGroup) {

        final ViewHolder holder;
        View view = contextView;
        if(view == null){
            Log.e("chenhaolog","MyAdapter [getView] position = "+i);
            holder = new ViewHolder();
            view = LayoutInflater.from(mContext).inflate(R.layout.list_item, viewGroup, false);
            holder.img = (ImageView) view.findViewById(R.id.img);
            view.setTag(holder);
        }else{
            Log.i("chenhaolog","MyAdapter [getView] position = "+i);
            holder = (ViewHolder) view.getTag();
        }
//        holder.img.setImageResource(R.drawable.asd);
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                holder.img.setImageResource(R.mipmap.ic_launcher);
            }
        });
//        if(i % 2 == 0){
//            holder.img.setImageResource(R.drawable.asd);
//            holder.img.setLayoutParams(new LinearLayout.LayoutParams(600,600));
//        }else{
//            holder.img.setImageResource(R.mipmap.ic_launcher);
//            holder.img.setLayoutParams(new LinearLayout.LayoutParams(150,150));
//        }
        return view;
    }
    private static class ViewHolder{
        ImageView img;
    }
}

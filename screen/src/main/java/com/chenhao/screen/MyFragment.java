package com.chenhao.screen;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chenhao on 2016/9/24.
 */
public class MyFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        Button btn = (Button) view.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("chenhaolog","btn click");
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage("确认退出？");
                builder.setTitle("MyFragment");
                builder.setPositiveButton("确定",null);
                builder.setNegativeButton("取消",null);
                builder.create().show();
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("chenhaolog","MyFragment [onStart]--------");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("chenhaolog","MyFragment [onPause]--------");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("chenhaolog","MyFragment [onResume]--------");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("chenhaolog","MyFragment [onStop]--------");
    }
}

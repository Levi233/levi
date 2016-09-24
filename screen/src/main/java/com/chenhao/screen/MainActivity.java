package com.chenhao.screen;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setMessage("确认退出？");
//                builder.setTitle("MainActivity");
//                builder.setPositiveButton("确定",null);
//                builder.setNegativeButton("取消",null);
//                builder.create().show();
//            }
//        });
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, new MyFragment2());
        ft.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("chenhaolog","MainActivity [onPause]--------");
    }
}

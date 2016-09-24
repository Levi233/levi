package com.chenhao.practice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Button btn = (Button) findViewById(R.id.btn1);
        mTextView = (TextView) findViewById(R.id.textView);
        GridView listView = (GridView) findViewById(R.id.listView);
        listView.setAdapter(new MyAdapter(MainActivity.this));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThread();
            }
        });

//        Bitmap bitmap = BitmapFactory.decodeFile("图片地址");
    }

    private void openThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //变成looper线程
//                Looper.prepare();
//                Looper.loop();
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mTextView.setText("子线程更新的内容");
                    }
                });
            }
        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTextView = null;
    }
}

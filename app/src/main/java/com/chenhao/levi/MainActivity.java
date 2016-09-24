package com.chenhao.levi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv_icon = (ImageView) findViewById(R.id.iv_icon);
        TextView btn = (TextView) findViewById(R.id.btn);
        final TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, -0.5f,
                Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, -0.5f,
                Animation.RELATIVE_TO_PARENT, 0.5f);
        ta.setDuration(3000); //设置动画的时间
        ta.setRepeatCount(1); //设置动画的显示次数
//        ta.setiRepeatMode(AlphaAnimation.REVERSE);//设置播放模式
        ta.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ta.setFillEnabled(true);
                ta.setFillAfter(true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        iv_icon.startAnimation(ta);//开启动画
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ta.setFillEnabled(true);
                ta.setFillAfter(true);
            }
        });
        iv_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "img click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

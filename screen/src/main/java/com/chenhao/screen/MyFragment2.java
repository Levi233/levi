package com.chenhao.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chenhao on 2016/9/24.
 */
public class MyFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_2,container,false);
    }

    @Override
    public void onResume() {
        super.onResume();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Log.e("chenhaolog","当前屏幕dpi : "+displayMetrics.densityDpi);
        Log.e("chenhaolog","当前屏幕密度比 : "+displayMetrics.density);
        Log.e("chenhaolog","当前屏幕像素 : "+displayMetrics.heightPixels+"*"+displayMetrics.widthPixels);
    }
}

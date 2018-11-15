package com.example.logan.dialogfragmentdemo;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;

public class GlobalConfig {

    //屏幕的宽
    private static volatile int screenWidthPixels = 0;
    //屏幕的高
    private static volatile int screenHeightPixels = 0;

    private static GlobalConfig instance = null;

    private GlobalConfig(){}

    public static GlobalConfig getInstance(){
        if (instance == null){
            synchronized (GlobalConfig.class){
                if(instance == null){
                    return instance = new GlobalConfig();
                }
            }
        }
        return instance;
    }

    public  void init(final Context context){
        new Thread(new Runnable() {
            @Override
            public void run() {
                DisplayMetrics metrics = context.getResources().getDisplayMetrics();
                screenWidthPixels = metrics.widthPixels;
                screenHeightPixels = metrics.heightPixels;
            }
        }).start();
    }

    public int getScreenWidthPixels() {
        return screenWidthPixels;
    }

    public int getScreenHeightPixels() {
        return screenHeightPixels;
    }
}

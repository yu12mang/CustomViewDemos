package com.example.logan.dialogfragmentdemo;

import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GlobalConfig.getInstance().init(this);
    }
}

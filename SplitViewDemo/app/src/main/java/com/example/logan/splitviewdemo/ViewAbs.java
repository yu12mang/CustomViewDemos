package com.example.logan.splitviewdemo;

import android.support.annotation.NonNull;
import android.view.View;

public abstract class ViewAbs {

    public View contentView;
    public boolean isShowing = false;

    public ViewAbs(@NonNull View view){
        contentView = view;
        onCreateView(view);
    }

    public abstract void onCreateView(View view);


    public void show() {
        contentView.setVisibility(View.VISIBLE);
        isShowing = true;
    }


    public void hide() {
        contentView.setVisibility(View.GONE);
        isShowing = false;
    }

}

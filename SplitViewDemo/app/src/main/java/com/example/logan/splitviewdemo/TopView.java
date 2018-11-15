package com.example.logan.splitviewdemo;

import android.view.View;
import android.widget.TextView;

public class TopView extends ViewAbs {

    private TextView tvTest;

    public TopView(View view) {
        super(view);
    }

    @Override
    public void onCreateView(View view) {
        tvTest = view.findViewById(R.id.tv_test);
        tvTest.setText("hello i am top view");
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }
}

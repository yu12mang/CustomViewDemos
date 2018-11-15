package com.example.logan.splitviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TopView topView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btnShowTopView =  findViewById(R.id.btn_show_top_view);
        btnShowTopView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (topView == null){
                    ViewStub stubTopView = findViewById(R.id.stub_top_view);
                    View view = stubTopView.inflate();
                    topView = new TopView(view);
                }

                if (topView.isShowing){
                    topView.hide();
                    btnShowTopView.setText("显示控件");
                }else{
                    topView.show();
                    btnShowTopView.setText("关闭控件");
                }
            }
        });

    }


}

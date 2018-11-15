package com.example.logan.dialogfragmentdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

public class CustomDialogFragment extends DialogFragment {

    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_FRAME, R.style.MyMiddleDialogStyle);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE); //无标题
        View view = inflater.inflate(R.layout.view_custom_dialog_fragment, container);
        TextView tv = view.findViewById(R.id.tv);
        tv.setText("I am dialog fragment");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        int dialogHeight = (int) (GlobalConfig.getInstance().getScreenHeightPixels() * 0.8);
        int dialogWidth = (int) (GlobalConfig.getInstance().getScreenWidthPixels() * 0.8);
        getDialog().getWindow().setLayout(dialogWidth, dialogHeight);
        getDialog().setCanceledOnTouchOutside(true); //点击边际可消失
    }
}

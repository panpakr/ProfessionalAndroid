package com.example.professionalandroid.chapterII;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.professionalandroid.R;

public class MainActivity extends AppCompatActivity {

    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        createProgramattically();
    }

    private void initViews() {

        textView = findViewById(R.id.tv_hello);
    }

    private void createProgramattically() {

        //Create Layout Parameters for Relative Layout ViewGroup
        RelativeLayout.LayoutParams container_layoutParams =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        //Create Layout Parameters for TextView
        RelativeLayout.LayoutParams textView_layoutParams =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Add padding from Resource

        Resources resources = getResources();
        int h_pad = resources.getDimensionPixelSize(R.dimen.horizontal_padding);
        int v_pad = resources.getDimensionPixelSize(R.dimen.vertical_padding);

        //Create View/ViewGroup Objects
        RelativeLayout container = new RelativeLayout(this);
        container.setPadding(h_pad,v_pad,h_pad,v_pad);

        TextView textView = new TextView(this);
        textView.setText("Programming 101");

        container.setLayoutParams(container_layoutParams);
        textView.setLayoutParams(textView_layoutParams);

        container.addView(textView);
        setContentView(container);


    }
}
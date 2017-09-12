package com.troy.checkimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CheckImageView cvImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        cvImageView = (CheckImageView) findViewById(R.id.cvImageView);

        cvImageView.setOnCheckedChangeListener(new CheckImageView.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(boolean isChecked) {
                if (isChecked) {
                    textView.setText("按钮选中");
                } else {
                    textView.setText("按钮未选中");
                }
            }
        });
    }
}

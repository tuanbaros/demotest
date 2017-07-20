package com.simple.demotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mClickMeButton;
    TextView mHelloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickMeButton = (Button) findViewById(R.id.btn_click_me);
        mHelloWorldTextView = (TextView) findViewById(R.id.tv_hello_world);

        mClickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClassName(getBaseContext(), "com.simple.demotest.Main2Activity");
                Intent launchIntent =
                        getPackageManager().getLaunchIntentForPackage("com.simple.demotest");
//                startActivity(new Intent("com.simple.demotest.Main2Activity"));
                startActivity(intent);
            }
        });
    }
}

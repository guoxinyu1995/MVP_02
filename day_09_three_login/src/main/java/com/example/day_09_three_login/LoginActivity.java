package com.example.day_09_three_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //获取资源id
        textView = findViewById(R.id.text);
        imageView = findViewById(R.id.image);
        //获取值
        Intent intent = getIntent();
        String screen_name = intent.getStringExtra("screen_name");
        String profile_image_url = intent.getStringExtra("profile_image_url");
        textView.setText(screen_name);
        ImageLoader.getInstance().displayImage(profile_image_url,imageView);
    }
}

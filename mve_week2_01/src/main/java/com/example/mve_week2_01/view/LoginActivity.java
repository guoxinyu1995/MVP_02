package com.example.mve_week2_01.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.mve_week2_01.R;
import com.example.mve_week2_01.adaper.LoginAdaper;
import com.example.mve_week2_01.fragment.CardFragment;

import java.util.UUID;

public class LoginActivity extends AppCompatActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private LoginAdaper adaper;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();

    }
    private CallBack fCallBack;
    //定义接口
    public interface CallBack{
        void setChange(String str);
    }
    //定义传值的方法
    public void setfCallBack(CallBack fCallBack){
        this.fCallBack = fCallBack;
        //接收值
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        if(fCallBack!=null){
            fCallBack.setChange(username);
        }
    }
    private void initView() {
        //获取资源id
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.v_page);
        //创建适配器
        adaper = new LoginAdaper(getSupportFragmentManager());
        viewPager.setAdapter(adaper);
        tabLayout.setupWithViewPager(viewPager);
    }

}

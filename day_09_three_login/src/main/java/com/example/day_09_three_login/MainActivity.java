package com.example.day_09_three_login;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView qq;
    private ImageView qzong;
    private ImageView weixin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //获取资源id
        qq = findViewById(R.id.qq);
        qzong = findViewById(R.id.qzong);
        weixin = findViewById(R.id.weixin);
        //qq点击
        qq.setOnClickListener(this);
        //分享
        qzong.setOnClickListener(this);
        //微信
        weixin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.qq:
                //得到UMShareAPI实例
                UMShareAPI umShareAPI = UMShareAPI.get(MainActivity.this);
                //开始登陆
                umShareAPI.getPlatformInfo(MainActivity.this, SHARE_MEDIA.QQ, new UMAuthListener() {
                    //开始登陆回调
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {
                        Log.i("gxy", "UMAuthListener onStart");
                    }
                    //登录完成
                    @Override
                    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                        Log.i("gxy", "UMAuthListener onComplete");
                        //18 = {HashMap$HashMapEntry@831427635280} "screen_name" -> "丢丢"
                        //19 = {HashMap$HashMapEntry@831427615752} "profile_image_url" -> "http://thirdqq.qlogo.cn/qqapp/100424468/974986458467CB74970B57B32EFC321F/100"
                        String screen_name = map.get("screen_name");
                        String profile_image_url = map.get("profile_image_url");
                        ImageLoader.getInstance().displayImage(profile_image_url,qq);
                        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                        intent.putExtra("screen_name",screen_name);
                        intent.putExtra("profile_image_url",profile_image_url);
                        startActivity(intent);
                    }
                    //登录失败
                    @Override
                    public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                        Log.i("gxy", "UMAuthListener onError");
                    }
                    //登录取消
                    @Override
                    public void onCancel(SHARE_MEDIA share_media, int i) {
                        Log.i("gxy", "UMAuthListener onCancel");
                    }
                });
                break;
                //微信
            case R.id.weixin:
                //得到UMShareAPI实例
                UMShareAPI umShareAPI1 = UMShareAPI.get(MainActivity.this);
                //开始登陆
                umShareAPI1.getPlatformInfo(MainActivity.this, SHARE_MEDIA.WEIXIN, new UMAuthListener() {
                    //开始登陆回调
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {
                        Log.i("gxy", "UMAuthListener onStart");
                    }
                    //登录完成
                    @Override
                    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                        Log.i("gxy", "UMAuthListener onComplete");

                    }
                    //登录失败
                    @Override
                    public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                        Log.i("gxy", "UMAuthListener onError");
                    }
                    //登录取消
                    @Override
                    public void onCancel(SHARE_MEDIA share_media, int i) {
                        Log.i("gxy", "UMAuthListener onCancel");
                    }
                });
                break;
                //分享
            case R.id.qzong:
                UMImage umImage = new UMImage(MainActivity.this,R.drawable.umeng_socialize_qq);
                new ShareAction(MainActivity.this)
                        //分享的标题
                        .withText("你好")
                        //分享的图片
                        .withMedia(umImage)
                        //分享到哪
                        .setDisplayList(SHARE_MEDIA.QZONE,SHARE_MEDIA.QQ)
                        //设置回调
                        .setCallback(shareListener)
                        .open();
                break;
                default:
                    break;
        }
    }
    private UMShareListener shareListener = new UMShareListener() {
        /**
         * @descrption 分享开始的回调
         *
         */
        @Override
        public void onStart(SHARE_MEDIA share_media) {
            Log.i("gxy", "UMAuthListener onStart");
        }
        /**
         * @descrption 分享成功的回调
         *
         */
        @Override
        public void onResult(SHARE_MEDIA share_media) {
            Log.i("gxy", "UMAuthListener onResult");
        }
        /**
         * @descrption 分享失败的回调
         *
         */
        @Override
        public void onError(SHARE_MEDIA share_media, Throwable throwable) {
            Log.i("gxy", "UMAuthListener onError");
        }
        /**
         * @descrption 分享取消的回调
         *
         */
        @Override
        public void onCancel(SHARE_MEDIA share_media) {
            Log.i("gxy", "UMAuthListener onCancel");
        }
    };
    /**
     * 添加回调
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }
}

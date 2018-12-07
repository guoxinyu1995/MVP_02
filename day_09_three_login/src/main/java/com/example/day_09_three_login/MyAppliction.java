package com.example.day_09_three_login;

import android.app.Application;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class MyAppliction extends Application {
    /**
     * 第一步：导入jar包和res文件，将jar包add as lib..
     * 第二步：自定义Application 在onCreate中完成以下两行代码（所有参数没有自己注册过不要改）
     * 第三步：在Manifests中添加配置，详见Manifests注释（不要随意修改）
     * 第四步：在需要调用的地方写调用，详见MainActivity中
     */
    @Override
    public void onCreate() {
        super.onCreate();
        //调用初始化接口：
        UMConfigure.init(this,"5a12384aa40fa3551f0001d1","umeng",UMConfigure.DEVICE_TYPE_PHONE,"");
        //QQ的配置
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        //微信的配置
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        ImageLoader.getInstance().init(new ImageLoaderConfiguration.Builder(this)
                .memoryCacheSizePercentage(50)
                .diskCacheSize(50*1024*1024)
                .defaultDisplayImageOptions(new DisplayImageOptions.Builder()
                        .bitmapConfig(Bitmap.Config.RGB_565)
                        .cacheOnDisk(true)
                        .cacheInMemory(true)
                        .showImageOnLoading(R.mipmap.ic_launcher)
                        .showImageOnFail(R.mipmap.ic_launcher)
                        .showImageForEmptyUri(R.mipmap.ic_launcher)
                        .build())
                .build());
    }
}

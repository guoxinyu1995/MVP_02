package com.example.mvp_verification.service;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;


public class BindService extends Service {

    private MyBind myBind;
    @Override
    public void onCreate() {
        super.onCreate();
        myBind = new MyBind();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBind;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
    //定义内部类
      class MyBind extends Binder{
        public void getService(){
            Random random = new Random();
            random.nextInt(999999);
        }

      }

}

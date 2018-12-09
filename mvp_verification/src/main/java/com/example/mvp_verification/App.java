package com.example.mvp_verification;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "eb4f561aad", false);
    }
}

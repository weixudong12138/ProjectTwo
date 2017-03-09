package com.weixudong12138;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2017/1/12.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}

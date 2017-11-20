package com.example.sophixtest;

import android.app.Application;

/**
 * Created by data on 2017/11/16.
 */

public class MyApplication extends Application {

    MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }


}

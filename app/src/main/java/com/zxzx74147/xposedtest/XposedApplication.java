package com.zxzx74147.xposedtest;

import android.app.Application;

/**
 * Created by zhengxin on 15/10/28.
 */
public class XposedApplication extends Application {

    private static XposedApplication mInstance;

    public static XposedApplication sharedInstance(){
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}

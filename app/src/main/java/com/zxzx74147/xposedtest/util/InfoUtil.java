package com.zxzx74147.xposedtest.util;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.zxzx74147.xposedtest.XposedApplication;

/**
 * Created by zhengxin on 15/10/28.
 */
public class InfoUtil {

    public static String getIMEI(){
        TelephonyManager tm = (TelephonyManager) XposedApplication.sharedInstance().getSystemService(Context.TELEPHONY_SERVICE);
        String IMEIStr = tm.getDeviceId();
        return IMEIStr;
    }

}

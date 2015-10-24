package com.zxzx74147.xposedtest.faker;

import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import java.util.HashMap;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by zhengxin on 15/10/23.
 */
public class AllFaker implements IXposedHookLoadPackage {

    public static HashMap<String ,AllFaker> mTable = new HashMap<>();

    static{

    }

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        XposedBridge.log("Loaded app: " + loadPackageParam.packageName);
        if(mTable.containsKey(loadPackageParam.packageName))

        //fake Build
        XposedHelpers.setStaticObjectField(Build.class, "BOARD", "BOARD_XPOSED");

        //fake imei
        XposedHelpers.findAndHookMethod(TelephonyManager.class, "getDeviceId", new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                String imei = "abc" + System.currentTimeMillis();
                XposedBridge.log("xposed imei=" + imei);
                return imei;
            }
        });

        //fake android_id

        XposedHelpers.setStaticObjectField(Settings.Secure.class, "ANDROID_ID", "BOARD_XPOSED");
    }
}

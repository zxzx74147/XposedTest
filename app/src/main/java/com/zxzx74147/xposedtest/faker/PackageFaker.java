package com.zxzx74147.xposedtest.faker;

import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import com.zxzx74147.xposedtest.generator.AndroidIDGenerator;
import com.zxzx74147.xposedtest.generator.ImeiGenerator;
import com.zxzx74147.xposedtest.stategy.CommonStategy;
import com.zxzx74147.xposedtest.stategy.PackageStategy;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by zhengxin on 15/10/23.
 */
public class PackageFaker implements IXposedHookLoadPackage {



    private ImeiGenerator mImeiGenerator = null;
    private AndroidIDGenerator mAndroidIdFaker = null;


    public PackageFaker(PackageStategy config){
        for(CommonStategy stategy:config.stategys){
            if("imei".equals(stategy.tag)){
                mImeiGenerator = new ImeiGenerator(stategy);
            }else if("android_id".equals(stategy.tag)){
                mAndroidIdFaker = new AndroidIDGenerator(stategy);
            }
        }

    }

     @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam){
         //fake Build
         XposedHelpers.setStaticObjectField(Build.class, "BOARD", "BOARD_XPOSED");

         //fake imei
         final String imei = mImeiGenerator.getNextValue();
         if(imei != null) {

             XposedHelpers.findAndHookMethod(TelephonyManager.class, "getDeviceId", new XC_MethodReplacement() {
                 @Override
                 protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                     return imei;
                 }
             });
         }

         //fake android_id
         final String android_id = mImeiGenerator.getNextValue();
         XposedHelpers.setStaticObjectField(Settings.Secure.class, "ANDROID_ID", android_id);
     }
}

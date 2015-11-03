package com.zxzx74147.xposedtest.faker;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

import com.google.gson.Gson;
import com.zxzx74147.xposedtest.data.ConfigData;
import com.zxzx74147.xposedtest.stategy.PackageStategy;
import com.zxzx74147.xposedtest.util.AssertUtil;

import java.io.IOException;
import java.util.HashMap;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by zhengxin on 15/10/23.
 */
public class AllFaker implements IXposedHookLoadPackage, IXposedHookZygoteInit {

    public static HashMap<String, PackageFaker> mTable = new HashMap<>();
    private static boolean hasInitConfig = false;

    private static void initConfig() {
        hasInitConfig = true;
        String json = null;
        try {
            Context moduleContext = AndroidAppHelper.currentApplication().createPackageContext("com.zxzx74147.xposedtest", Context.CONTEXT_IGNORE_SECURITY);
            json = AssertUtil.AssetJSONFile("config.json", moduleContext);
            ConfigData config = new Gson().fromJson(json, ConfigData.class);
            Log.e("package name=", moduleContext.getPackageName());
            Log.e("json=", json);
            if (config != null && config.fake_data != null) {
                for (PackageStategy stategy : config.fake_data) {
                    XposedBridge.log("package name: " + stategy.package_name);
                    PackageFaker faker = new PackageFaker(stategy);
                    mTable.put(stategy.package_name, faker);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        XposedBridge.log("Loaded app: " + loadPackageParam.packageName);
        Log.e("Loaded app:", loadPackageParam.packageName);

        if (!hasInitConfig) {
            XposedHelpers.findAndHookMethod("android.app.Application", loadPackageParam.classLoader,
                    "onCreate", new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                            Application application = (Application) param.thisObject;
                            XposedBridge.log("Loaded app: onCraete=" + application.getPackageName());
                            initConfig();
                            XposedBridge.log("Loaded app table: " + mTable.toString());
                            XposedBridge.log("Loaded app now: " + loadPackageParam.packageName);

                            if (mTable.containsKey(loadPackageParam.packageName)) {
                                XposedBridge.log("Loaded app match: " + loadPackageParam.packageName);
                                Log.e("Loaded app match:", loadPackageParam.packageName);
                                PackageFaker faker = mTable.get(loadPackageParam.packageName);
                                faker.handleLoadPackage(loadPackageParam);
                            }
                        }

                        protected void beforeHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                        }
                    });
        }
    }

    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {

    }
}

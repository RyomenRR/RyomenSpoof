package com.ryomen.spoof;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;

public class SpoofModule implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if ("com.pubg.imobile".equals(lpparam.packageName)) {
            XposedBridge.log("RyomenSpoof: Spoofing BGMI as PUBG");
            lpparam.appInfo.packageName = "com.tencent.ig";
        }
    }
}

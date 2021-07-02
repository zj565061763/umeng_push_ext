package com.sd.lib.umeng_push_ext;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

import org.android.agoo.huawei.HuaWeiRegister;
import org.android.agoo.mezu.MeizuRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;

public class LibUmengPushExt {
    private LibUmengPushExt() {
    }

    /**
     * 初始化第三方平台推送通道
     */
    public static void init(Context context) {
        final Resources resources = context.getResources();

        final String huaweiAppId = resources.getString(R.string.lib_umeng_push_ext_huawei_app_id);
        if (!TextUtils.isEmpty(huaweiAppId)) {
            HuaWeiRegister.register((Application) context.getApplicationContext());
        }

        final String xiaomiAppId = resources.getString(R.string.lib_umeng_push_ext_xiaomi_app_id);
        final String xiaomiAppKey = resources.getString(R.string.lib_umeng_push_ext_xiaomi_app_key);
        if (!TextUtils.isEmpty(xiaomiAppId) && !TextUtils.isEmpty(xiaomiAppKey)) {
            MiPushRegistar.register(context, xiaomiAppId, xiaomiAppKey);
        }

        final String meizuAppId = resources.getString(R.string.lib_umeng_push_ext_meizu_app_id);
        final String meizuAppKey = resources.getString(R.string.lib_umeng_push_ext_meizu_app_key);
        if (!TextUtils.isEmpty(meizuAppId) && !TextUtils.isEmpty(meizuAppKey)) {
            MeizuRegister.register(context, meizuAppId, meizuAppKey);
        }

        final String oppoAppKey = resources.getString(R.string.lib_umeng_push_ext_oppo_app_key);
        final String oppoAppSecret = resources.getString(R.string.lib_umeng_push_ext_oppo_app_secret);
        if (!TextUtils.isEmpty(oppoAppKey) && !TextUtils.isEmpty(oppoAppSecret)) {
            OppoRegister.register(context, oppoAppKey, oppoAppSecret);
        }

        final String vivoAppId = resources.getString(R.string.lib_umeng_push_ext_vivo_app_id);
        final String vivoAppKey = resources.getString(R.string.lib_umeng_push_ext_vivo_app_key);
        if (!TextUtils.isEmpty(vivoAppId) && !TextUtils.isEmpty(vivoAppKey)) {
            VivoRegister.register(context);
        }
    }
}

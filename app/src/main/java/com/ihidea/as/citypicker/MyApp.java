package com.ihidea.as.citypicker;

import android.app.Application;
import android.content.Context;

import com.lljjcoder.style.citylist.utils.CityListLoader;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * 作者：liji on 2017/12/15 10:55
 * 邮箱：lijiwork@sina.com
 * QQ ：275137657
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * 预先加载一级列表所有城市的数据
         */
        CityListLoader.getInstance().loadCityData(this);
        
        /**
         * 预先加载三级列表显示省市区的数据
         */
        CityListLoader.getInstance().loadProData(this);

        refWatcher = LeakCanary.install(this);
    }


    //在自己的Application中添加如下代码
    private RefWatcher refWatcher;

    //在自己的Application中添加如下代码
    public static RefWatcher getRefWatcher(Context context) {
        MyApp application = (MyApp) context.getApplicationContext();
        return application.refWatcher;
    }
}

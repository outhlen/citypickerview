/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ihidea.as.citypicker.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.ihidea.as.citypicker.R;

import java.io.Serializable;

/**
 * Activity工具类
 */
public class ActivityUtils {
    
    private static class Holder {
        private static final ActivityUtils instance = new ActivityUtils();
    }
    
    private ActivityUtils() {
        
    }
    
    public static final ActivityUtils getInstance() {
        return Holder.instance;
    }
    
    public void showActivity(Activity aty, Class clazz) {
        Intent i = new Intent(aty, clazz);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    
    public void showActivity(Activity aty, Class clazz, String key, Serializable serialize) {
        Intent i = new Intent(aty, clazz);
        i.putExtra(key, serialize);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    
    public void showActivity(Activity aty, Class clazz, Bundle bundle) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    
    public void skipActivity(Activity aty, Class clazz) {
        Intent i = new Intent(aty, clazz);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        aty.finish();
    }
    
    public void skipActivity(Activity aty, Class clazz, Bundle bundle) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        aty.finish();
    }
    
    public void closeSelf(Activity aty) {
        aty.finish();
    }
    
    public void showActivityForResult(Activity aty, int requestCode, Class clazz) {
        Intent i = new Intent(aty, clazz);
        aty.startActivityForResult(i, requestCode);
    }
    
    public void showActivity(Activity aty, int flags, Class clazz) {
        Intent i = new Intent(aty, clazz);
        i.setFlags(flags);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    
    public void skipActivity(Activity aty, int flags, Class clazz) {
        Intent i = new Intent(aty, clazz);
        i.setFlags(flags);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        aty.finish();
    }
    
    public void skipActivity(Activity aty, Bundle bundle, int flags, Class clazz) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        i.setFlags(flags);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        aty.finish();
    }
    
    public void showActivity(Activity aty, int flags, Bundle bundle, Class clazz) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        i.setFlags(flags);
        aty.startActivity(i);
        aty.overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    
    public void showActivity(Context aty, int flags, Bundle bundle, Class clazz) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        i.setFlags(flags);
        aty.startActivity(i);
        
    }
    
    public void showActivity(Context aty, int flags, Class clazz) {
        Intent i = new Intent(aty, clazz);
        i.setFlags(flags);
        aty.startActivity(i);
    }
    
    public void showActivityAnima(Activity aty, Class clazz, Bundle bundle, int inAnima, int outAnima) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        aty.startActivity(i);
        aty.overridePendingTransition(inAnima, outAnima);
    }
    
    public void showActivityAnima(Activity aty, Class clazz, int flags, int inAnima, int outAnima) {
        Intent i = new Intent(aty, clazz);
        i.setFlags(flags);
        aty.startActivity(i);
        aty.overridePendingTransition(inAnima, outAnima);
    }
    
    public void skipActivityAnima(Activity aty, Class clazz, Bundle bundle, int inAnima, int outAnima) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        aty.startActivity(i);
        aty.overridePendingTransition(inAnima, outAnima);
        aty.finish();
    }
    
    public void showActivityAnima(Activity aty, Class clazz, int inAnima, int outAnima) {
        Intent i = new Intent(aty, clazz);
        aty.startActivity(i);
        aty.overridePendingTransition(inAnima, outAnima);
    }
    
    public void showActivityAnima(Activity aty, Class clazz, int flags, Bundle bundle, int inAnima, int outAnima) {
        Intent i = new Intent(aty, clazz);
        i.putExtras(bundle);
        i.setFlags(flags);
        aty.startActivity(i);
        aty.overridePendingTransition(inAnima, outAnima);
    }
    
    public void showActivity(Context aty, Intent intent) {
        aty.startActivity(intent);
    }
}

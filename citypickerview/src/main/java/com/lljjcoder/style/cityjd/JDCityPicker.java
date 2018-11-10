package com.lljjcoder.style.cityjd;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.lljjcoder.citywheel.CityParseHelper;
import com.lljjcoder.style.citypickerview.R;
import com.lljjcoder.style.citypickerview.widget.CanShow;
import com.lljjcoder.utils.utils;

/**
 * 仿京东城市选择器
 * 作者：liji on 2018/1/26 16:08
 * 邮箱：lijiwork@sina.com
 * QQ ：275137657
 */

public class JDCityPicker implements CanShow {
    
    private ViewPager mDataViewPager;
    
    private TextView mProTv;
    
    private TextView mCityTv;
    
    private TextView mAreaTv;
    
    private PopupWindow popwindow;
    
    private View popview;
    
    private CityParseHelper parseHelper;
    
    private Context context;
    
    /**
     * 初始化，默认解析城市数据，提交加载速度
     */
    public void init(Context context) {
        this.context = context;
        parseHelper = new CityParseHelper();
        
        //解析初始数据
        if (parseHelper.getProvinceBeanArrayList().isEmpty()) {
            parseHelper.initData(context);
        }
        
    }
    
    private void initJDCityPickerPop() {
        
        //解析初始数据
        if (parseHelper == null) {
            parseHelper = new CityParseHelper();
            if (parseHelper.getProvinceBeanArrayList().isEmpty()) {
                throw new IllegalArgumentException("请在Activity中增加init操作");
            }
        }
        
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        popview = layoutInflater.inflate(R.layout.pop_jdcitypicker, null);
        
        mDataViewPager = (ViewPager) popview.findViewById(R.id.cityViewpager);
        mProTv = (TextView) popview.findViewById(R.id.province_tv);
        mCityTv = (TextView) popview.findViewById(R.id.city_tv);
        mAreaTv = (TextView) popview.findViewById(R.id.area_tv);
        
        popwindow = new PopupWindow(popview, LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        popwindow.setAnimationStyle(R.style.AnimBottom);
        popwindow.setBackgroundDrawable(new ColorDrawable());
        popwindow.setTouchable(true);
        popwindow.setOutsideTouchable(false);
        popwindow.setFocusable(true);
        
        popwindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                utils.setBackgroundAlpha(context, 1.0f);
            }
        });
        
        utils.setBackgroundAlpha(context, 0.5f);
        
        initJDPickerData(context);
        
    }
    
    /**
     * 首先加载省份数据
     */
    private void initJDPickerData(Context context) {
        ProvinceAdapter provinceAdapter = new ProvinceAdapter(context, parseHelper.getProvinceBeanArrayList());
    }
    
    @Override
    public void hide() {
        
    }
    
    @Override
    public boolean isShow() {
        return false;
    }
}

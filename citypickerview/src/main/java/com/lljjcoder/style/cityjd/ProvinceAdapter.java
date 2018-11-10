package com.lljjcoder.style.cityjd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.style.citypickerview.R;

import java.util.List;

/**
 * 作者：liji on 2018/1/29 17:01
 * 邮箱：lijiwork@sina.com
 * QQ ：275137657
 */

public class ProvinceAdapter extends BaseAdapter {
    
    Context context;
    
    List<ProvinceBean> mProList;
    
    public ProvinceAdapter(Context context, List<ProvinceBean> mProList) {
        this.context = context;
        this.mProList = mProList;
    }
    
    @Override
    public int getCount() {
        return mProList.size();
    }

    @Override
    public ProvinceBean getItem(int position) {
        return mProList.get(position);
    }
    
    @Override
    public long getItemId(int position) {
        return Long.parseLong(mProList.get(position).getId());
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pop_jdcitypicker_item, parent, false);

            holder = new Holder();
            holder.textView = (TextView) convertView.findViewById(R.id.textView);
            holder.imageViewCheckMark = (ImageView) convertView.findViewById(R.id.imageViewCheckMark);

            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        ProvinceBean item = getItem(position);
        holder.textView.setText(item.getName());

        return convertView;
    }


    class Holder {
        TextView textView;
        ImageView imageViewCheckMark;
    }
}

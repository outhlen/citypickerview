package com.ihidea.as.citypicker.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 作者：liji on 2017/9/20 11:20
 * 邮箱：lijiwork@sina.com
 * QQ ：275137657
 */

public class CityPickerStyleBean implements Parcelable {
    int resourId;

    String title;

    public int getResourId() {
        return resourId;
    }

    public void setResourId(int resourId) {
        this.resourId = resourId;
    }

    public String getTitle() {
        return title == null ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.resourId);
        dest.writeString(this.title);
    }

    public CityPickerStyleBean() {
    }

    protected CityPickerStyleBean(Parcel in) {
        this.resourId = in.readInt();
        this.title = in.readString();
    }

    public static final Creator<CityPickerStyleBean> CREATOR = new Creator<CityPickerStyleBean>() {
        @Override
        public CityPickerStyleBean createFromParcel(Parcel source) {
            return new CityPickerStyleBean(source);
        }

        @Override
        public CityPickerStyleBean[] newArray(int size) {
            return new CityPickerStyleBean[size];
        }
    };
}

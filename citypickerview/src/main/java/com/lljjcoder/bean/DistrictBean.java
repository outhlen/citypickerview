package com.lljjcoder.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @2Do:
 * @Author M2
 * @Version v ${VERSION}
 * @Date 2017/7/7 0007.
 */
public class DistrictBean implements Parcelable {

    private String AREAID; /*110101*/
    
    private String AREA; /*东城区*/

    public String getAREAID() {
        return AREAID;
    }

    public void setAREAID(String AREAID) {
        this.AREAID = AREAID;
    }

    public String getAREA() {
        return AREA;
    }

    public void setAREA(String AREA) {
        this.AREA = AREA;
    }

    public DistrictBean() {
    }

    public DistrictBean(Parcel in) {
        AREAID = in.readString();
        AREA = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(AREAID);
        dest.writeString(AREA);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DistrictBean> CREATOR = new Creator<DistrictBean>() {
        @Override
        public DistrictBean createFromParcel(Parcel in) {
            return new DistrictBean(in);
        }

        @Override
        public DistrictBean[] newArray(int size) {
            return new DistrictBean[size];
        }
    };
}

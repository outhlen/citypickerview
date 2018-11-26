package com.lljjcoder.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * @2Do:
 * @Author M2
 * @Version v ${VERSION}
 * @Date 2017/7/7 0007.
 */
public class CityBean implements Parcelable {

    private String CITYID; /*110101*/
    private String CITY; /*东城区*/
    private ArrayList<DistrictBean> countyList;

    public String getCITYID() {
        return CITYID;
    }

    public void setCITYID(String CITYID) {
        this.CITYID = CITYID;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public ArrayList<DistrictBean> getCountyList() {
        return countyList;
    }

    public void setCountyList(ArrayList<DistrictBean> countyList) {
        this.countyList = countyList;
    }

    public CityBean() {
    }

    public CityBean(Parcel in) {
        CITYID = in.readString();
        CITY = in.readString();
        countyList = in.createTypedArrayList(DistrictBean.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(CITYID);
        dest.writeString(CITY);
        dest.writeTypedList(countyList);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CityBean> CREATOR = new Creator<CityBean>() {
        @Override
        public CityBean createFromParcel(Parcel in) {
            return new CityBean(in);
        }

        @Override
        public CityBean[] newArray(int size) {
            return new CityBean[size];
        }
    };


}

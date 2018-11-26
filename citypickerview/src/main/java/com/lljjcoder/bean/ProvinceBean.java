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
public class ProvinceBean implements Parcelable {

  private String PROVINCEID; /*110101*/

  private String PROVINCE; /*东城区*/

  private ArrayList<CityBean> cityList;

  public String getPROVINCEID() {
    return PROVINCEID;
  }

  public void setPROVINCEID(String PROVINCEID) {
    this.PROVINCEID = PROVINCEID;
  }

  public String getPROVINCE() {
    return PROVINCE;
  }

  public void setPROVINCE(String PROVINCE) {
    this.PROVINCE = PROVINCE;
  }

  public ArrayList<CityBean> getCityList() {
    return cityList;
  }

  public void setCityList(ArrayList<CityBean> cityList) {
    this.cityList = cityList;
  }

  public ProvinceBean() {
  }

  public ProvinceBean(Parcel in) {
    PROVINCEID = in.readString();
    PROVINCE = in.readString();
    cityList = in.createTypedArrayList(CityBean.CREATOR);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(PROVINCEID);
    dest.writeString(PROVINCE);
    dest.writeTypedList(cityList);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public static final Creator<ProvinceBean> CREATOR = new Creator<ProvinceBean>() {
    @Override
    public ProvinceBean createFromParcel(Parcel in) {
      return new ProvinceBean(in);
    }

    @Override
    public ProvinceBean[] newArray(int size) {
      return new ProvinceBean[size];
    }
  };
}

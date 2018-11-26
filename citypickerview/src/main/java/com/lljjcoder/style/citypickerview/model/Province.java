package com.lljjcoder.style.citypickerview.model;

import java.util.List;

public class Province {
    private String PROVINCE;
    private String PROVINCEID;
    private int SID;
    private List<City> cityList;

    public static class City {
        private int CID;
        private String CITY;
        private String CITYID;
        private List<Country> countyList;

        public List<Country> getCountyList() {
            return countyList;
        }

        public void setCountyList(List<Country> countyList) {
            this.countyList = countyList;
        }

        public static class Country{
            private int RID;
            private String FATHER;
            private String AREA;
            private String AREAID;

            public int getRID() {
                return RID;
            }

            public void setRID(int RID) {
                this.RID = RID;
            }

            public String getFATHER() {
                return FATHER;
            }

            public void setFATHER(String FATHER) {
                this.FATHER = FATHER;
            }

            public String getAREA() {
                return AREA;
            }

            public void setAREA(String AREA) {
                this.AREA = AREA;
            }

            public String getAREAID() {
                return AREAID;
            }

            public void setAREAID(String AREAID) {
                this.AREAID = AREAID;
            }
        }

        public int getCID() {
            return CID;
        }

        public void setCID(int CID) {
            this.CID = CID;
        }

        public String getCITY() {
            return CITY;
        }

        public void setCITY(String CITY) {
            this.CITY = CITY;
        }

        public String getCITYID() {
            return CITYID;
        }

        public void setCITYID(String CITYID) {
            this.CITYID = CITYID;
        }
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    public String getPROVINCEID() {
        return PROVINCEID;
    }

    public void setPROVINCEID(String PROVINCEID) {
        this.PROVINCEID = PROVINCEID;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}

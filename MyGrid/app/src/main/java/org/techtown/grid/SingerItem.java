package org.techtown.grid;

public class SingerItem {

    String name;
    String mobile;
    int resID;

    public SingerItem(String name, String mobile, int resID) {
        this.name = name;
        this.mobile = mobile;
        this.resID = resID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;

    }
    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    @Override
    public String toString() {
        return "SingerItem{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", resID=" + resID +
                '}';
    }
}

package com.example.retrofit07062022;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pphat on 8/23/2022.
 */
public class Demo1 {

    @SerializedName("monhoc")
    private String monHoc;
    @SerializedName("noihoc")
    private String noiHoc;
    private String website;
    @SerializedName("fanpage")
    private String fanPage;
    private String logo;

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getNoiHoc() {
        return noiHoc;
    }

    public void setNoiHoc(String noiHoc) {
        this.noiHoc = noiHoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanPage() {
        return fanPage;
    }

    public void setFanPage(String fanPage) {
        this.fanPage = fanPage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

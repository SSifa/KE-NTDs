package com.example.ke_ntds.model;

public class Case {
    String caseType, mobility, location;
    int img;

    public Case(int img, String caseType, String mobility, String location) {
        this.img = img;
        this.caseType = caseType;
        this.mobility = mobility;
        this.location = location;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

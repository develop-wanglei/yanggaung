package com.yangguang.entity;

public class Title {
    private String titleImg;

    private String location;

    public Title() {
    }

    public Title(String titleImg, String location) {
        this.titleImg = titleImg;
        this.location = location;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg == null ? null : titleImg.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    @Override
    public String toString() {
        return "Title{" +
                "titleImg='" + titleImg + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
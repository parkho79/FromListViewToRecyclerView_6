package com.parkho.listview;

public class PhCountryItem {

    public PhCountryItem(int a_imageResId, String a_strCountry) {
        mImageResId = a_imageResId;
        mStrCountry = a_strCountry;
    }

    private int mImageResId;

    private String mStrCountry;

    public void setImageResId(int a_imageResId) {
        mImageResId = a_imageResId;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public void setCountry(String a_strCountry) {
        mStrCountry = a_strCountry;
    }

    public String getCountry() {
        return mStrCountry;
    }
}
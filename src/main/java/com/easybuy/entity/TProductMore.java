package com.easybuy.entity;

public class TProductMore extends TProduct{
    private String smallCatname;
    private String bigCatname;
    private Integer bigCatId;

    public TProductMore() {
    }

    public TProductMore(String smallCatname, String bigCatname, Integer bigCatId) {
        this.smallCatname = smallCatname;
        this.bigCatname = bigCatname;
        this.bigCatId = bigCatId;
    }

    public String getSmallCatname() {
        return smallCatname;
    }

    public void setSmallCatname(String smallCatname) {
        this.smallCatname = smallCatname;
    }

    public String getBigCatname() {
        return bigCatname;
    }

    public void setBigCatname(String bigCatname) {
        this.bigCatname = bigCatname;
    }

    public Integer getBigCatId() {
        return bigCatId;
    }

    public void setBigCatId(Integer bigCatId) {
        this.bigCatId = bigCatId;
    }

    @Override
    public String toString() {
        return "TProductMore{" +
                "smallCatname='" + smallCatname + '\'' +
                ", bigCatname='" + bigCatname + '\'' +
                ", bigCatId=" + bigCatId +
                '}';
    }

}

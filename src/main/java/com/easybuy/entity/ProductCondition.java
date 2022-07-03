package com.easybuy.entity;

import java.util.Date;

public class ProductCondition{
    private Integer id;

    private String name;

    private String description;

    private Float salePrice;

    private Float costPrice;

    private Integer cateId;

    private String picUrl;

    private Date createTime;

    private Integer createUser;

    private Integer pageNo;

    private Integer pageSize;

    public ProductCondition() {
    }

    public ProductCondition(Integer id, String name, String description, Float salePrice, Float costPrice, Integer cateId, String picUrl, Date createTime, Integer createUser, Integer pageNo, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
        this.cateId = cateId;
        this.picUrl = picUrl;
        this.createTime = createTime;
        this.createUser = createUser;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Float costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "ProductCondition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", salePrice=" + salePrice +
                ", costPrice=" + costPrice +
                ", cateId=" + cateId +
                ", picUrl='" + picUrl + '\'' +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}

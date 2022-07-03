package com.easybuy.entity;

public class TShopCart {
    private Integer id;

    private Integer productId;

    private Integer buyCount;

    private Integer custmerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getCustmerId() {
        return custmerId;
    }

    public void setCustmerId(Integer custmerId) {
        this.custmerId = custmerId;
    }
}
package com.easybuy.entity;

import java.util.Date;

public class TOrders {
    private Integer id;

    private Integer custmerId;

    private String createTime;

    private String targetAddr;

    private Float totalCount;

    private String status;

    //一对一关联顾客表
    /*private String userName;*/

    public Integer getId() {
        return id;
    }

/*    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }*/

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustmerId() {
        return custmerId;
    }

    public void setCustmerId(Integer custmerId) {
        this.custmerId = custmerId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTargetAddr() {
        return targetAddr;
    }

    public void setTargetAddr(String targetAddr) {
        this.targetAddr = targetAddr;
    }

    public Float getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Float totalCount) {
        this.totalCount = totalCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TOrders{" +
                "id=" + id +
                ", custmerId=" + custmerId +
                ", createTime='" + createTime + '\'' +
                ", targetAddr='" + targetAddr + '\'' +
                ", totalCount=" + totalCount +
                ", status='" + status + '\'' +
                '}';
    }
}
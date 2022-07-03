package com.easybuy.entity;

public class TOrdersMore extends TOrders{
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "TOrdersMore{" +
                "userName='" + userName + '\'' +
                '}';
    }
}

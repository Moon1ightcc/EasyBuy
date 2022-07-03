package com.easybuy.entity;


public class TCustomer {
    private Integer id;

    private String userName;

    private String name;

    private String password;

    private String sex;

    private String birthday;

    private String address;

    private String picture;

    private String phoneNumber;

    public TCustomer() {
    }

    public TCustomer(Integer id, String userName, String name, String password, String sex, String birthday, String address, String picture, String phoneNumber) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.picture = picture;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "TCustomer{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", picture='" + picture + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
package com.accolite.model;

import java.io.Serializable;

public class Address implements Serializable {

    private Integer addId;
    private String city;
    private String state;
    private String district;
    private String country;

    public Address() {
    }

    public Address(Integer addId, String city, String state, String district, String country) {
        this.addId = addId;
        this.city = city;
        this.state = state;
        this.district = district;
        this.country = country;
    }

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addId=" + addId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

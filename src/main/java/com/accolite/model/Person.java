package com.accolite.model;

import java.io.Serializable;

public final class Person implements Serializable {

    private final Integer perId;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address;


    public Person(Integer perId, String firstName, String lastName, Integer age, Address address) {
        this.perId = perId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = new Address(address.getAddId(),address.getCity(),address.getDistrict(),address.getState(),address.getCountry());
    }

    public Integer getPerId() {
        return perId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        Address address = null;
        if(this.address != null)
            address = new Address(this.address.getAddId(),this.address.getCity(),this.address.getDistrict(),this.address.getState(),this.address.getCountry());
        return address;
    }
}

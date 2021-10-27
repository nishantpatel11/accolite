package com.accolite.model;

import java.io.Serializable;

public class Department implements Serializable {

    private Integer deptId;
    private String name;
    private String location;

    public Department() {
    }

    public Department(Integer deptId, String name, String location) {
        this.deptId = deptId;
        this.name = name;
        this.location = location;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

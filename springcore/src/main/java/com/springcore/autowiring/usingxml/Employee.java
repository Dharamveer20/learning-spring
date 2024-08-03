package com.springcore.autowiring.usingxml;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    Address address;
    Education education;
    public Employee(){};

    public Address getAddress() {
        return address;
    }
//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Education getEducation() {
        return education;
    }
    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", education=" + education +
                '}';
    }
}

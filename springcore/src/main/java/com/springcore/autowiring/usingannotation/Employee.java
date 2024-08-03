package com.springcore.autowiring.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address1")
    Address address;

    @Autowired
    Education education;

//    public Employee(){};

    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Address Setter called ");
    }
//    @Autowired
    public void setEducation(Education education) {
        this.education = education;
        System.out.println("Education Setter called ");

    }
//    @Autowired
//    public Employee(Address address, Education education) {
//        this.address = address;
//        this.education = education;
//        System.out.println("Constructor Injection called ");
//    }

    public Education getEducation() {
        return education;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", education=" + education +
                '}';
    }
}

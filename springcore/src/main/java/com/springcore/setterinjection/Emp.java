package com.springcore.setterinjection;
import java.util.*;

public class Emp {
    private String name;
    private List<String> phoneNo;
    private HashSet<String> addresses;
    private Map<String,String> courses;

    public  Emp(){

    }
    public Emp(String name, List<String> phoneNo, HashSet<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.addresses = addresses;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }

    public HashSet<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(HashSet<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phoneNo =" + phoneNo +
                ", addresses =" + addresses +
                ", courses=" + courses +
                '}';
    }
}

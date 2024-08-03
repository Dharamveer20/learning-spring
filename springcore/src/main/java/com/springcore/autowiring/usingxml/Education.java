package com.springcore.autowiring.usingxml;

public class Education {
    String edu;

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    @Override
    public String toString() {
        return "Education{" +
                "edu='" + edu + '\'' +
                '}';
    }
}

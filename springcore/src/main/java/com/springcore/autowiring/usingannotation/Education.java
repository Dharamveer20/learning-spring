package com.springcore.autowiring.usingannotation;

public class Education {
    String edu;

//    public Education(){};

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

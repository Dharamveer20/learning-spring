package com.springcore.constructorinjection;

import java.util.List;

public class Person {

    private String name;
    private int personId;
    private List<Integer> li;
    private Certificate certi;
    public Person() {};

    public Person(String name, int personId, List<Integer> list, Certificate certi) {
        this.name = name;
        this.personId = personId;
        li = list;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", li=" + li +
                ", certi=" + certi +
                '}';
    }
}

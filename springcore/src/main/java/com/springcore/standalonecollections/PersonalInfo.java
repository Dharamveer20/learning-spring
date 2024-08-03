package com.springcore.standalonecollections;

import java.util.*;

public class PersonalInfo {
    private List<String> friends;
    private Map<String,Integer> age;

    public Map<String, Integer> getAge() {
        return age;
    }

    public void setAge(Map<String, Integer> age) {
        this.age = age;
    }
    public void setFriends(List<String> friends){this.friends = friends;}

    public List<String> getFriends(){return friends;}

    @Override
    public String toString(){
        return "friends: " + this.friends + "\nFriends name and age: " + age;
    }

}

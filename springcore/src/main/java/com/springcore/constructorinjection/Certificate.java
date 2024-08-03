package com.springcore.constructorinjection;

public class Certificate {
    private String a;
    public Certificate(String a){
        this.a=a;
    }
    public Certificate(){};
    @Override
    public String toString(){
     return "achievement { " + a + "}";
    }
}

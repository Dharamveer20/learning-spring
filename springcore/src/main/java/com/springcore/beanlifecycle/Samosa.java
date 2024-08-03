package com.springcore.beanlifecycle;

public class Samosa {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Assigning value of the field");
    }
    public void init(){
        System.out.println("Inside Init method");
    }
    public void destroy(){
        System.out.println("Inside Init method");
    }
}

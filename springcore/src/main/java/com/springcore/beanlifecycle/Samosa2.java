package com.springcore.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa2 {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Assigning value of the field");
    }

    @PostConstruct
    public void start(){
        System.out.println("Inside Init method");
    }

    @PreDestroy
    public void end(){
        System.out.println("Inside Init method");
    }
}

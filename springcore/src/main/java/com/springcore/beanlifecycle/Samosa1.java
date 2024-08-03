package com.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa1 implements InitializingBean, DisposableBean {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Assigning value of the field");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside Init function Samosa1");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy function Samosa1");
    }
}

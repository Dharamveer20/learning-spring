package com.springcore.autowiring.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringUsingXmlConfig.xml");
        Employee employee = context.getBean("emp",Employee.class);
        System.out.println(employee);
    }

}



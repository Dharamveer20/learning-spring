package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class); // Note: here we used different implemented class of ApplicationContext
        Student stu = con.getBean("getStudent",Student.class); // See bean name is same as function name.
        System.out.println(stu.age);
    }
}

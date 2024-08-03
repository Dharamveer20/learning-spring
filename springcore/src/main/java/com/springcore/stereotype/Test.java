package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("stereoConfig.xml");
        Student stu = con.getBean("student",Student.class); // Note: Name of the class is Student then default bean name is student.
        System.out.println(stu.name);
        System.out.println(stu.studentNames);
        System.out.println(stu.age);
    }
}

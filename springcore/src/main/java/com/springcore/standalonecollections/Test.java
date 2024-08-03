package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("standaloneConfig.xml");
            PersonalInfo personalInfo = context.getBean("person1", PersonalInfo.class);
            System.out.println(personalInfo);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

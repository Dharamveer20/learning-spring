package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorConfig.xml", "ambiRes.xml");
        Person person = (Person) context.getBean("pers");
        System.out.println(person);

        AmbiguityResolution ambiRes= (AmbiguityResolution) context.getBean("ambi");
        ambiRes.sum();

    }
}

package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        init method is invoked with ApplicationContext interface but for destroy method we create Object of one of the parent class of ApplicationContext named AbstractApplicationContext
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanlifeConfig.xml");
//        Samosa sam = (Samosa)context.getBean("sam");
//        System.out.println(sam.getPrice());

        // This Class has a registerShutdownHook() method which calls our destroy method.
        context.registerShutdownHook();

//        Samosa1 sam1 = (Samosa1)context.getBean("samo1");
//        System.out.println(sam1.getPrice());

        Samosa2 sam2 = (Samosa2)context.getBean("samo2");
        System.out.println(sam2.getPrice());
    }
}

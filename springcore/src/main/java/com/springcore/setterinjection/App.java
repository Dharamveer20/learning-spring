package com.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        System.out.println("joi");
//        // Creating Spring IoC Container.
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); // para -> location of the xml file.
//        // We can pass single xml file as string(like above) ya phir if we have multiple xml file we can pass the array.
//        // Asking the container for the object.
//        Student student1 = (Student) context.getBean("student1");
//        context.getBean("student1");  // student1 is name of the bean. With this code we the get the object from the container and we typecast it to class (here our class name was Student)
//        System.out.println(student1);
//
//    // ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
//        Student stu2 = (Student) context.getBean("student2");
//        System.out.println(stu2.getStudentId());
//        System.out.println(stu2);

        // For Collection nothing Different
//        ApplicationContext con1 = new ClassPathXmlApplicationContext("collectionConfig.xml");
//        Emp e1 = (Emp)con1.getBean("emp");App
//        System.out.println(e1);

        //For Reference type
        ApplicationContext con2 = new ClassPathXmlApplicationContext("referenceConfig.xml");
        A a1 = (A)con2.getBean("aref");
//        or we can do
//        A a1 = con2.getBean("aref",A.class);

        System.out.println(a1);

    }
}
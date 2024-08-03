package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // With this Annotation we are saying ye class (here javaConfig class) xml file ka saara kaam karega (bean configuration basically)
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Inside this class we specify which class object the IoC container must create.
public class JavaConfig {
    @Bean // Annotation which tells IoC container to create the object
    public Student getStudent(){ // Just create function with return type of the class jiska object create krna h IoC container me.
        return new Student(); // bss we need to return the object.
    }
//    Note: Name of the function is the name of the bean (here getStudent)
}

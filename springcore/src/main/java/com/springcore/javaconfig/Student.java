package com.springcore.javaconfig;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component
public class Student {
    @Value("Tano") // Initializing name to Tano whenever the object is created.
    String name;
    @Value("22") // Initializing age
    int age;
}

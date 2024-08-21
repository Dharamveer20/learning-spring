package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.StudentDaoImpl;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDaoImpl.class);
        Student student = new Student(1,"Jano", "Hatia");
        System.out.println(studentDao.insert(student));
    }
}
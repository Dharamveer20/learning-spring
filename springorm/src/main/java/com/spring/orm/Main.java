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
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            StudentDao studentDao = context.getBean("studentDao", StudentDaoImpl.class);

//          Insertion
//            Student student = new Student(3, "Lano", "Vatia");
//            System.out.println(studentDao.insert(student));

            // Reading single column
//            System.out.println(studentDao.getStudentById(2));

//            Reading all columns
            System.out.println(studentDao.getAllStudents());

            // Deleting a column
//            studentDao.deleteStudent(2);

//            Updating a column
//            studentDao.updateStudent(new Student (3,"Mano","Dhanbad"));


        } catch(Exception e){
            System.out.println(e);
        }
    }
}
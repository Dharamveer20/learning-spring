package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); // For XML based configuration.
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

////    ----------------  GIVING DATA TO THE DB -----------------------
////        Inserting into the Table
//        Student student = context.getBean("student",Student.class);
        StudentDao studentDao = context.getBean("studentDaoImplement", StudentDao.class);
////        System.out.println(studentDao.insert(student));
//
////        Updating the table
//        Student student1 = context.getBean("student1",Student.class);
////        studentDao.insert(student1);
//        int res = studentDao.update(student1);
//        System.out.println(res);
//
////        Deleting a row
//        int result = studentDao.delete(2);
//        System.out.println(result);

//  ------------- FETCHING DATA FROM DB -----------------
//        Fetching 1 row/resultset
        Student student = studentDao.getStudent(3);
        System.out.println(student);

        Student student1 = studentDao.getStudent(1);
        System.out.println(student1);

////        Fetching all rows/resultset
//        List<Student> students = studentDao.getStudents();
//        for(Student stu : students){
//            System.out.println(stu);
//        }
    }
}

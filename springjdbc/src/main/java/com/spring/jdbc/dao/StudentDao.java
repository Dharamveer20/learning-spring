package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    int update(Student student);
    int delete(int id);
    Student getStudent(int id);
    List <Student> getStudents() ;

}

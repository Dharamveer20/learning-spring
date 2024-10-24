package com.spring.orm.dao;

import com.spring.orm.entities.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void updateStudent(Student student);
    void deleteStudent(int id);
}

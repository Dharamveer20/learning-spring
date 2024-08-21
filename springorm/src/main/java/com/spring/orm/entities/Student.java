package com.spring.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // makes the class ready for database operations through ORM
@Table(name="student_details") // table the name of the table in the database jaha class ke fields map honge.
public class Student {
    @Id // Primary Key
    @Column(name="id") // column name
    private int studentId;
    @Column(name="name")
    private String studentName;
    @Column(name="city")
    private String studentCity;

    public Student(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
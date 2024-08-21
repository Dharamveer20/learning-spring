package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class z implements StudentDao {

    JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "insert into Student values (?,?,?)";

        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int update(Student student) {
        String q = "update Student set name=?, city=? where id=?";
        int r = this.jdbcTemplate.update(q,student.getName(),student.getCity(), student.getId());
        return r;
    }

    @Override
    public int delete(int id) {
        String query = "delete from Student where id=?";
        int res = this.jdbcTemplate.update(query, id);
        return res;
    }

    @Override
    public Student getStudent(int id) {
        String query = "select * from Student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        System.out.println("z");
        Student student = this.jdbcTemplate.queryForObject(query,rowMapper,id);
        return student;
    }

    @Override
    public List<Student> getStudents() {
        String query = "Select * from Student";

        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}


package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@ComponentScan( basePackages = "com.spring.jdbc.dao") // For autowiring
public class JavaConfig {
    @Bean(name = {"ds"})
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return jdbcTemplate;
    }

//    @Bean(name={"studentDaoImplement"})
//    public StudentDao getStudentDao(){
//        StudentDaoImpl studentDao = new StudentDaoImpl();
//        studentDao.setJdbcTemplate(getJdbcTemplate()); // StudentDaoImpl has setJdbcTemplate setter function.
//        return studentDao;
//    }
}

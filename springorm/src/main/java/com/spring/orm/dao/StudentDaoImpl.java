package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImpl implements StudentDao {
    private HibernateTemplate hibernateTemplate;

    @Transactional
    @Override
    public int insert(Student student) {
        Integer rowsAffected = (Integer)this.hibernateTemplate.save(student); // save method will insert provided object in the table.
        return rowsAffected;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

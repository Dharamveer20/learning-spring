package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

//    INSERTION
    @Transactional
    @Override
    public int insert(Student student) {
        Integer rowsAffected = (Integer)this.sessionFactory.getCurrentSession().save(student); // save method will insert provided object in the table.
        return rowsAffected;
    }

//    READING 1 COLUMN
    @Transactional
    @Override
    // Make sure Student Class has Default constructor
    public Student getStudentById(int id) {
        Student student = this.sessionFactory.getCurrentSession().get(Student.class, id);
        return student;
    }

//    READING THE TABLE
    @Transactional
    @Override
    public List<Student> getAllStudents() {
        List<Student> allStudents = this.sessionFactory.getCurrentSession().createQuery("from Student",Student.class).list();
//        createQuery() is a method of the Session interface used to create a Hibernate Query Language (HQL) query.
//        from Student: we mean is entity ka sab uthana hai db se. and typecaste bhi kr rahe hai.

        return allStudents;
    }

// UPDATE
    @Transactional
    @Override
    public void updateStudent(Student student) {
        this.sessionFactory.getCurrentSession().update(student);
//   update() :- This method updates the corresponding record in the database using the primary key (ID)

    }

//    DELETE
    @Transactional
    @Override
    public void deleteStudent(int id) {
        Student student = getStudentById(2);// student with id 2 nhi hua to null return hoga

        if(student != null) this.sessionFactory.getCurrentSession().delete(student);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

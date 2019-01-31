package org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PersonDaoImpl implements PersonDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionF) {
        this.sessionFactory = sessionF;
    }


    public void addPerson(Person person) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(person);
    }


}

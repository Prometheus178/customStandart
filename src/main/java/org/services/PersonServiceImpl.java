package org.services;

import org.dao.PersonDao;
import org.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonDao personDao;
    public PersonServiceImpl() {
        System.out.println("created");
    }


    public void setPersonDAO(PersonDao personDAO) {
        this.personDao = personDAO;
    }

    @Transactional
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

}

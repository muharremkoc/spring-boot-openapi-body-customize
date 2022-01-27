package com.springdoc.openapi.service;

import com.springdoc.openapi.dto.PersonDTO;
import com.springdoc.openapi.model.Person;

import java.util.List;

public interface PersonService {

    Person savePerson(PersonDTO personDTO);
    Person updatePerson(int pID,String firstName);
    Person getPerson(int pID);
    String deletePerson(int pID);
    List<Person> getPersons();
}

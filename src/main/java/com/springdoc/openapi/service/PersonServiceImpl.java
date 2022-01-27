package com.springdoc.openapi.service;

import com.springdoc.openapi.dto.PersonDTO;
import com.springdoc.openapi.mapper.PersonMapper;
import com.springdoc.openapi.model.Person;
import com.springdoc.openapi.repository.PersonRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonServiceImpl implements PersonService{

    final PersonRepository personRepository;
    final PersonMapper personMapper;

    @Override
    public Person savePerson(PersonDTO personDTO) {
        Person person=personMapper.personDTOtoPerson(personDTO);
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(int pID, String firstName) {
        Person currentPerson=personRepository.findById(pID).orElseThrow();
        currentPerson.setFirstName(firstName);
        return personRepository.save(currentPerson);
    }

    @Override
    public Person getPerson(int pID) {
        return personRepository.findById(pID).orElseThrow();
    }

    @Override
    public String deletePerson(int pID) {
        personRepository.deleteById(pID);
        return "Person ID's: "+pID+"was deleted";
    }

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}

package com.springdoc.openapi.controller;

import com.springdoc.openapi.dto.PersonDTO;
import com.springdoc.openapi.model.Person;
import com.springdoc.openapi.service.PersonService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/customize/persons")
public class PersonController {

    final PersonService personService;


    @PostMapping("/save/person")
    public Person savePerson(@RequestBody PersonDTO personDTO){
        return personService.savePerson(personDTO);
    }

    @PutMapping("/update/person/{pID}")
    public Person updatePerson(@PathVariable("pID") int pID,@RequestParam String firstName){
        return personService.updatePerson(pID, firstName);
    }
    @GetMapping("/get/person/{pID}")
    public Person getPerson(@PathVariable("pID")int pID){
        return personService.getPerson(pID);
    }
    @DeleteMapping("/get/person/{pID}")
    public String deletePerson(@PathVariable("pID")int pID){
        return personService.deletePerson(pID);
    }

    @GetMapping("/get/personList")
    public List<Person> getPersonList(){
        return personService.getPersons();
    }

}

package com.example.lab3ex1.service;

import com.example.lab3ex1.model.Person;
import com.example.lab3ex1.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//unde facem extra procesare a datelor

@Service
public class PersonService {


    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> retrieveAllPersons(){
        return personRepository.retrieveAllPersons()
                .stream().sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
        //Collections.sort() - primitive, ce nu presupune obiecte
    }

    public String addPerson(Person person){
        return personRepository.addPerson(person);
    }

    public String deletePerson(String firstName){
        return personRepository.deletePerson(firstName);
    }
}

package com.example.person.service.impl;

import com.example.person.dao.PersonRepository;
import com.example.person.domain.Person;
import com.example.person.model.PersonModel;
import com.example.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonModel save(PersonModel model) {

        Person person = Person.builder()
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .age(model.getAge())
                .nationalNumber(model.getNationalNumber())
                .email(model.getEmail())
                .address(model.getAddress())
                .phoneNumber(model.getPhoneNumber())
                .build();

        personRepository.save(person);
        return model;
    }

    @Override
    public PersonModel update(PersonModel model) {
        return null;
    }

    @Override
    public void delete(long personNationalCode) {

    }

    @Override
    public PersonModel findByNationalNumber(String nationalNumber) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}

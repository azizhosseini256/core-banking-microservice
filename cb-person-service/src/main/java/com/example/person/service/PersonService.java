package com.example.person.service;

import com.example.person.domain.Person;
import com.example.person.model.PersonModel;

import java.util.List;

public interface PersonService {

    PersonModel save(PersonModel model);

    PersonModel update(PersonModel model);

    void delete (long personNationalCode);

    PersonModel findByNationalNumber(String nationalNumber);

    List<Person> findAll();


}

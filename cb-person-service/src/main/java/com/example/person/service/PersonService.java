package com.example.person.service;

import com.example.person.domain.RealPerson;
import com.example.person.model.RealPersonModel;
import java.util.List;

public interface PersonService {

    RealPersonModel save(RealPersonModel model);

    RealPersonModel update(RealPersonModel model, String nationalNumber);

    RealPersonModel findRalPersonByNationalNumber(String realPersonNationalNumber);

    void deleteRealPersonByNationalNumber(String realPersonNationalNumber);

    List<RealPerson> findAll();

}
package com.example.person.service;

import com.example.person.model.RealPersonModel;

public interface PersonService {

    RealPersonModel save(RealPersonModel model);

    RealPersonModel update(RealPersonModel model, String nationalNumber);

    RealPersonModel findRalPersonByNationalNumber(String realPersonNationalNumber);

    void deleteRealPersonByNationalNumber(String realPersonNationalNumber);

}
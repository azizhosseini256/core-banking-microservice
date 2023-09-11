package com.example.person.service;

import com.example.person.model.RealPersonModel;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonService {

    RealPersonModel save(RealPersonModel model);

    RealPersonModel update(RealPersonModel model);

    RealPersonModel findRalPersonByNationalNumber(String realPersonNationalNumber);

    void deleteRealPersonByNationalNumber(String realPersonNationalNumber);

}
package com.example.person.service.impl;

import com.example.person.dao.RealPersonRepository;
import com.example.person.domain.RealPerson;
import com.example.person.model.RealPersonModel;
import com.example.person.service.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private RealPersonRepository realPersonRepository;

    @Override
    public RealPersonModel save(RealPersonModel model) {

        RealPerson person = new RealPerson();
        person.setFirstName(model.getFirstName());
        person.setLastName(model.getLastName());
        person.setNationalNumber(model.getNationalNumber());
        person.setBirthDate(model.getBirthDate());
        person.setEmail(model.getEmail());
        person.setAddress(model.getAddress());
        person.setPhoneNumber(model.getPhoneNumber());

        realPersonRepository.save(person);

        return findRalPersonByNationalNumber(model.getNationalNumber());
    }

    @Override
    public RealPersonModel update(RealPersonModel model) {
        realPersonRepository.updateRealPersonByNationalNumber(model);
        return findRalPersonByNationalNumber(model.getNationalNumber());
    }

    @Override
    public RealPersonModel findRalPersonByNationalNumber(String realPersonNationalNumber) {

        RealPersonModel model = new RealPersonModel();
        RealPerson person = realPersonRepository.findRealPersonByNationalNumber(realPersonNationalNumber);

        if (person!=null){
            BeanUtils.copyProperties(person,model);
            return model;
        } else return null;

    }

    @Override
    public void deleteRealPersonByNationalNumber(String realPersonNationalNumber) {
        realPersonRepository.deleteRealPersonByNationalNumber(realPersonNationalNumber);
    }
}
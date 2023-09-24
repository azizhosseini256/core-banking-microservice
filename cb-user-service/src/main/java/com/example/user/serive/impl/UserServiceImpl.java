package com.example.user.serive.impl;

import com.example.user.dao.UserRepository;
import com.example.user.domain.UserDomain;
import com.example.user.model.UserModel;
import com.example.user.serive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserModel save(UserModel model) {
        UserDomain userDomain = new UserDomain();
        userDomain.setUsername(model.getUsername());
        userDomain.setPassword(model.getPassword());
        userDomain.setPersonNationalNumber(model.getPersonNationalNumber());
        userRepository.save(userDomain);
        return findUserByUsername(model.getUsername());
    }

    @Override
    public UserModel update(UserModel model, String username) {
        userRepository.updateUserDomainByUsername(model, username);
        return findUserByUsername(username);
    }

    @Override
    public UserModel findUserByUsername(String username) {

        UserDomain domain = userRepository.findUserDomainByUsername(username);
        UserModel model = new UserModel();

        model.setUsername(domain.getUsername());
        model.setPassword(model.getPassword());
        model.setPersonNationalNumber(model.getPersonNationalNumber());
        return model;

    }

    @Override
    public void deleteUserByUsername(String username) {
        userRepository.deleteUserDomainByUsername(username);
    }

}
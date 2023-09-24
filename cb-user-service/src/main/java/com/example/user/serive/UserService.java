package com.example.user.serive;

import com.example.user.model.UserModel;

public interface UserService {

    UserModel save(UserModel model);

    UserModel update(UserModel model, String username);

    UserModel findUserByUsername(String username);

    void deleteUserByUsername(String username);

}
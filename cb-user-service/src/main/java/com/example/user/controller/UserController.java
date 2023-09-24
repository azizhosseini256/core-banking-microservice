package com.example.user.controller;

import com.example.user.model.UserModel;
import com.example.user.serive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel model){
        return ResponseEntity.ok(userService.save(model));
    }

    @PutMapping("/update-user-by-username/{username}")
    public ResponseEntity<UserModel> updateUser(UserModel model, String username){
        return ResponseEntity.ok(userService.update(model,username));
    }

    @DeleteMapping("/delete-by-username/{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable String username){
        userService.deleteUserByUsername(username);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-user-by-username/{username}")
    public ResponseEntity<UserModel> findUser(@PathVariable String username){
        return ResponseEntity.ok(userService.findUserByUsername(username));
    }

}
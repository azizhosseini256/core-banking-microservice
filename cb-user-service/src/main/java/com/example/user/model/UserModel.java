package com.example.user.model;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {

    //todo add regex pattern
    private String username;

    private String password;

    private String personNationalNumber;

}
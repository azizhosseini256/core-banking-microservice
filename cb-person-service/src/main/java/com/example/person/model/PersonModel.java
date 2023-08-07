package com.example.person.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonModel {

    @NotNull
//    @Pattern(regexp = "^[0-9]*$")
    private String firstName;

    @NotNull
//    @Pattern(regexp = "^[0-9]*$")
    private String lastName;

    @NotNull
    @Min(18)
    private int age;

    @NotNull
//    @Pattern(regexp = "^([0-9]){10}$")
    private String nationalNumber;

//    @Pattern(regexp = "^([a-za-z0-9\\._]-*)+@([a-za-z0-9_]-*)+(\\.[a-za-z0-9]+)+$")
    private String email;

    @NotNull
    private String address;

    @NotNull
//    @Pattern(regexp = "^(0?9)?[0-9]{9}$")
    private String phoneNumber;

}
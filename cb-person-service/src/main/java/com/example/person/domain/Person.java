package com.example.person.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Person {

    @NotNull
    @Column(name = "first_name")
    @Pattern(regexp = "^[a-zA-Z.\\s]+$")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    @Pattern(regexp = "^[a-zA-Z.\\s]+$")
    private String lastName;

    @Column(name = "national_number" , unique = true)
    @Pattern(regexp = "^([0-9]){10}$")
    private String nationalNumber;

}
package com.example.person.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 4979091214803154055L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "age")
    private int age;

    @Column (name = "national_number", unique = true)
    private String nationalNumber;

    @Column (name = "email", unique = true)
    private String email;

    @Column (name = "address")
    private String address;

    @Column (name = "phone_number")
    private String phoneNumber;

}
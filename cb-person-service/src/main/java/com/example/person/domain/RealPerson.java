package com.example.person.domain;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class RealPerson extends Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 4979091214803154055L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "birth_date")
    private LocalDate birthDate;

    @Column (name = "email", unique = true)
    private String email;

    @Column (name = "address")
    private String address;

    @Column (name = "phone_number")
    private String phoneNumber;

}
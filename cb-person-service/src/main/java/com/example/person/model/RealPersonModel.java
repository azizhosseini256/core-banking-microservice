package com.example.person.model;

import com.example.person.config.AgeValidator;
import com.example.person.domain.Person;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RealPersonModel extends Person {

    @NotNull
    @AgeValidator(18)
    @JsonFormat(pattern="yyyy-MM-dd", shape=JsonFormat.Shape.STRING)
    private LocalDate birthDate;

    @Pattern(regexp = "^([a-zA-Z0-9._]-*)+@([a-zA-Z0-9_]-*)+(\\.[a-zA-Z0-9]+)+$")
    private String email;

    @NotNull
    private String address;

    @NotNull
    @Pattern(regexp = "^(0?9)?[0-9]{9}$")
    private String phoneNumber;

}
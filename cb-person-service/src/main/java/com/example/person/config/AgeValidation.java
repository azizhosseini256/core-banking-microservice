package com.example.person.config;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class AgeValidation implements ConstraintValidator<AgeValidator, LocalDate> {

    private int ageLimit;

    @Override
    public void initialize(AgeValidator constraintAnnotation) {
        ageLimit = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate now = LocalDate.now();
        LocalDate ageLimitDate = now.minusYears(ageLimit);
        return localDate.isBefore(ageLimitDate);
    }

}
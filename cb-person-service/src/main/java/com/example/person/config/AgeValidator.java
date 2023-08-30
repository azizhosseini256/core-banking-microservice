package com.example.person.config;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AgeValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AgeValidator {

    String message() default "The birth date must be greater or equal than 18";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    int value() default 18;
}

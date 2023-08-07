package com.example.person.controller;

import com.example.person.domain.Person;
import com.example.person.model.PersonModel;
import com.example.person.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<PersonModel> save (@RequestBody @Valid PersonModel model){
        return ResponseEntity.ok(personService.save(model));
    }

    @GetMapping("/all")
    public List<Person> all(){
        return personService.findAll();
    }

}

package com.example.person.controller;

import com.example.person.model.RealPersonModel;
import com.example.person.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person/real-person")
public class RealPersonController {

    @Autowired
    private PersonService realPersonService;

    @PostMapping("/save")
    public ResponseEntity<RealPersonModel> save (@RequestBody @Valid RealPersonModel model){
        return ResponseEntity.ok(realPersonService.save(model));
    }

    @PutMapping("/update/{oldNationalNumber}")
    public ResponseEntity<RealPersonModel> updateByNationalNumber(@RequestBody @Valid RealPersonModel model, @PathVariable String oldNationalNumber){
        return ResponseEntity.ok(realPersonService.update(model, oldNationalNumber));
    }

    @DeleteMapping("/delete-by-national-number/{nationalNumber}")
    public ResponseEntity<Void> deleteByNationalNumber(@PathVariable String nationalNumber){
        realPersonService.deleteRealPersonByNationalNumber(nationalNumber);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-by-national-number/{nationalNumber}")
    public ResponseEntity<RealPersonModel> findRalPersonByNationalNumber(@PathVariable String nationalNumber){
        return ResponseEntity.ok(realPersonService.findRalPersonByNationalNumber(nationalNumber));
    }

}

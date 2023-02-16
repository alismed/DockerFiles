package com.itau.agro.controller;

import java.util.List;
import java.util.Optional;

//import com.itau.agro.exceptions.DebtNotFoundException;
import com.itau.agro.model.Debt;
import com.itau.agro.service.DebtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DebtController {
    @Autowired
    private DebtService debtService;

    @GetMapping("/debts")
    public ResponseEntity<List<Debt>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(debtService.findAll());
    }

    @GetMapping("/debts/{id}")
    public ResponseEntity<Optional<Debt>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(debtService.findById(id));
    }

    @PostMapping("/debts")
    public ResponseEntity<Debt> create(@RequestBody Debt debt){
        return ResponseEntity.status(HttpStatus.CREATED).body(debtService.save(debt));
    }

    @PutMapping("/debts/{id}")
    public ResponseEntity<Debt> update(@RequestBody Debt debt){
        return ResponseEntity.status(HttpStatus.OK).body(debtService.update(debt));
    }
}

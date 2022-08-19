package com.expample.loan.controller;

import com.expample.loan.entity.Loan;
import com.expample.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoanController {
    @Autowired
    private LoanService service;

    @PostMapping("/addLoan")
    public Loan addLoan(@RequestBody Loan loan) {

        return service.saveLoan(loan);
    }

    @GetMapping("/loans")
    public List<Loan> findAllLoans() {
        return service.getLoans();
    }

    @GetMapping("/LoanById/{id}")
    public Loan findLoanById(@PathVariable int id) {
        return service.getLoanById(id);
    }

    @GetMapping("/loan/{type}")
    public Loan findLoanByName(@PathVariable String type) {
        return service.getLoanByType(type);
    }

    /*@PutMapping("/update")
    public Loan updateLoan(@RequestBody Loan loan) {
        return service.updateLoan(loan);
    }*/

    @DeleteMapping("/deleteLoan/{id}")
    public String deleteLoan(@PathVariable int id) {
        return service.deleteLoan(id);
    }
}

package com.expample.loan.service;

import com.expample.loan.entity.CustomerEntity;
import com.expample.loan.entity.Loan;
import com.expample.loan.repository.CustomerRepository;
import com.expample.loan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository repository;

    public Loan saveLoan(Loan loan) {
        return repository.save(loan);
    }

    public List<Loan> saveLoans(List<Loan> loans) {
        return repository.saveAll(loans);
    }

    public List<Loan> getLoans() {
        return repository.findAll();
    }

    public Loan getLoanById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Loan getLoanByType(String name) {
        return repository.findByLoanType(name);
    }

    public String deleteLoan(int id) {
        repository.deleteById(id);
        return "Loan removed !! " + id;
    }

}

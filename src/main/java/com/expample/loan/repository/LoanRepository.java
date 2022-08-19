package com.expample.loan.repository;

import com.expample.loan.entity.CustomerEntity;
import com.expample.loan.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan,Integer> {
    Loan findByLoanType(String name);
    Loan findByCustomerId(int Id);

    Loan findByLoanId(int id);
}

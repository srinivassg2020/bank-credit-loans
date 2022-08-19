package com.expample.loan.service;

import com.expample.loan.entity.Loan;
import com.expample.loan.entity.LoanDetail;
import com.expample.loan.repository.LoanDetailsRepository;
import com.expample.loan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanDetailService {
    @Autowired
    private LoanDetailsRepository repository;

    public LoanDetail saveLoanDetail(LoanDetail loan) {
        return repository.save(loan);
    }

    public List<LoanDetail> saveLoanDetails(List<LoanDetail> loans) {
        return repository.saveAll(loans);
    }

    public List<LoanDetail> getLoanDetails() {
        return repository.findAll();
    }

    /*public LoanDetail getLoanDetailByLoanId(int id) {
        return repository.findById(id).orElse(null);
    }*/
    public List<LoanDetail> getLoanDetailByLoanId(int id) {
        return repository.findByLoanId(id);
    }

}

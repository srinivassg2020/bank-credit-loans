package com.expample.loan.controller;

import com.expample.loan.entity.Loan;
import com.expample.loan.entity.LoanDetail;
import com.expample.loan.service.LoanDetailService;
import com.expample.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LoanDetailController {
    @Autowired
    private LoanDetailService service;

    @PostMapping("/addLoanDetail")
    public LoanDetail addLoanDetail(@RequestBody LoanDetail loanDetail) {

        return service.saveLoanDetail(loanDetail);
    }

    @GetMapping("/loanDetails")
    public List<LoanDetail> findAllLoanDetails() {
        return service.getLoanDetails();
    }

    @GetMapping("/LoanDetailByLoanId/{id}")
    public List<LoanDetail> findLoanDetailByLoanId(@PathVariable int id) {
        return service.getLoanDetailByLoanId(id);
    }

}

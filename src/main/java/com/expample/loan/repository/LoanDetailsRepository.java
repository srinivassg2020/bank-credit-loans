package com.expample.loan.repository;

import com.expample.loan.entity.Loan;
import com.expample.loan.entity.LoanDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetail,Integer> {
    List<LoanDetail> findByLoanId(int id);
}

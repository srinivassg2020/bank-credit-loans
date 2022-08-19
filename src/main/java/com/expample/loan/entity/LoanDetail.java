package com.expample.loan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="LOAN_DETAILS")
public class LoanDetail {
    @Id
    @GeneratedValue
    private int loanDetailId;
    private int loanId;
    private String loanType;
    private String currency;
    private double loanAmount;
    private double loanInstalmentAmount;
    private String loanInstalmentPaymentDate;
}

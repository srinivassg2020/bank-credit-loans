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
@Table(name="LOAN")
public class Loan {
    @Id
    @GeneratedValue
    private int loanId;
    private int customerId;
    private String loanType;
    private String currency;
    private double loanAmount;
    private double loanPendingAmount;
    private String interestRate;
    private int   totalInstalments;
    private int   remainingInstalments;
    private String loanStartDate;
    private String loanEndDate;
}

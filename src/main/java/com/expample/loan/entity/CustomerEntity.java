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
@Table(name="CUSTOMER")
public class CustomerEntity {
    @Id
    @GeneratedValue
    private int custId;
    private String customerName;
    private String email;
    private String mobile;
    private String address;
}

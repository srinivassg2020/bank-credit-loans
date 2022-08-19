package com.expample.loan.repository;

import com.expample.loan.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {

    CustomerEntity findByCustomerName(String name);
}

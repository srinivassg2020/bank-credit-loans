package com.expample.loan.service;

import com.expample.loan.entity.CustomerEntity;
import com.expample.loan.repository.CustomerRepository;
import com.expample.loan.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return repository.save(customer);
    }

    public List<CustomerEntity> saveCustomers(List<CustomerEntity> customers) {
        return repository.saveAll(customers);
    }

    public List<CustomerEntity> getCustomers() {
        return repository.findAll();
    }

    public CustomerEntity getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public CustomerEntity getCustomerByName(String name) {
        return repository.findByCustomerName(name);
    }

    public String deleteCustomer(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public CustomerEntity updateCustomer(CustomerEntity customer) {
        CustomerEntity existingCustomer = repository.findById(customer.getCustId()).orElse(null);
        existingCustomer.setCustomerName(customer.getCustomerName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setMobile(customer.getMobile());
        existingCustomer.setAddress(customer.getAddress());
        return repository.save(existingCustomer);
    }

}

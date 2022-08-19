package com.expample.loan.controller;

import com.expample.loan.entity.CustomerEntity;
import com.expample.loan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/addCustomer")
    public CustomerEntity addCustomer(@RequestBody CustomerEntity customer) {

        return service.saveCustomer(customer);
    }

    @PostMapping("/addCustomers")
    public List<CustomerEntity> addCustomers(@RequestBody List<CustomerEntity> customers) {
        return service.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<CustomerEntity> findAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/CustomerById/{id}")
    public CustomerEntity findcustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }

    @GetMapping("/customer/{name}")
    public CustomerEntity findCustomerByName(@PathVariable String name) {
        return service.getCustomerByName(name);
    }

    @PutMapping("/update")
    public CustomerEntity updateCustomer(@RequestBody CustomerEntity customer) {
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return service.deleteCustomer(id);
    }
}

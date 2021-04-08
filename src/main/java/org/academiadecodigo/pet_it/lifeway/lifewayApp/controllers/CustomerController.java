package org.academiadecodigo.pet_it.lifeway.lifewayApp.controllers;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CustomerController{

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public List<Customer> getCustomers() {
       return customerService.getCustomers();
    }
}

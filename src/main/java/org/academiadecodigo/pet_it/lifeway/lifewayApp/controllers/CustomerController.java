package org.academiadecodigo.pet_it.lifeway.lifewayApp.controllers;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = {"/", ""})
    public Customer getStart() {

        Customer customer = new Customer();
        Customer customer1 = new Customer();
        customer1.setEmail("joaobarroso@joaobarroso.com");
        customer1.setPassword("password");
        customer1.setFirstName("Joao");
        customer1.setLastName("Barroso");
        customer1.setCity("Barcelos");
        customer1.setCountry("Portugal");
        customerService.addCustomer(customer1);

        return customer;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , path = {"/savecustomer"})
    public Customer newCustomer(@RequestBody Customer customer) {
        if(customerService.addCustomer(customer) == null){
            return getStart();
        }
        return customerService.login(customer);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , path = {"/login"})
    public Customer login(@RequestBody Customer customer) {
        if(customerService.login(customer) == null){
            return getStart();
        }
        return customerService.login(customer);
    }





}

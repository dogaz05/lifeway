package org.academiadecodigo.pet_it.lifeway.lifewayApp.controllers;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = {"/", ""})
    public List<Customer> getCustomers() {

        Customer customer = new Customer();

        customer.setName("lel");
        customer.setAge(15);

        customerService.addCustomer(customer);

        return customerService.getCustomers();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void newCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }
}

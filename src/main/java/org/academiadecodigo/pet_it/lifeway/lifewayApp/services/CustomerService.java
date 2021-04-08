package org.academiadecodigo.pet_it.lifeway.lifewayApp.services;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.dao.CustomerRepo;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepo customerRepo;


    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Autowired
    public void setCustomerRepo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}

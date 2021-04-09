package org.academiadecodigo.pet_it.lifeway.lifewayApp.dao;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeDaoDao {

    private List<Customer> customerList;

    public FakeDaoDao() {
        this.customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}

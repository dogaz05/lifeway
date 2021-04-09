package org.academiadecodigo.pet_it.lifeway.lifewayApp.dao;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CustomerDao {

    private Map<String, String> customerMapLogin;
    private List<Customer> customerList;
    private Map<String, Integer> customerIds;

    public CustomerDao() {
        this.customerMapLogin = new HashMap<>();
        this.customerList = new ArrayList<>();
        this.customerIds = new HashMap<>();

    }

    public Map<String, String> getCustomerMapLogin() {
        return customerMapLogin;
    }

    public Map<String, Integer> getCustomerIds() {
        return customerIds;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}

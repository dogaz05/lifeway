package org.academiadecodigo.pet_it.lifeway.lifewayApp.services;


import org.academiadecodigo.pet_it.lifeway.lifewayApp.dao.FakeDaoDao;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    //private CustomerRepo customerRepo;
    private FakeDaoDao fakeDaoDao;


    public List<Customer> getCustomers() {
        return fakeDaoDao.getCustomerList();
    }

    @Autowired
    public void setFakeDaoDao(FakeDaoDao fakeDaoDao) {
        this.fakeDaoDao = fakeDaoDao;
    }

    public void addCustomer(Customer customer) {
        fakeDaoDao.getCustomerList().add(customer);
    }
}

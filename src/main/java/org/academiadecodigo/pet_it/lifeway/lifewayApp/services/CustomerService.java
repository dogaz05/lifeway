package org.academiadecodigo.pet_it.lifeway.lifewayApp.services;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.dao.CustomerDao;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    //private CustomerRepo customerRepo;
    private CustomerDao customerDao;

    @Autowired
    public void setFakeDaoDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    public Customer login(Customer customer) {
        if (customerDao.getCustomerMapLogin().containsKey(customer.getEmail()) &&
                customerDao.getCustomerMapLogin().get(customer.getEmail()).equals(customer.getPassword())) {
            return customerDao.getCustomerList().get(customerDao.getCustomerIds().get(customer.getEmail()));
        } else {
            return null;
        }
    }

    int counter = 0;

    public Customer addCustomer(Customer customer) {

        if (!customerDao.getCustomerMapLogin().containsKey(customer.getEmail())) {
            customerDao.getCustomerList().add(customer);
            customerDao.getCustomerMapLogin().put(customer.getEmail(), customer.getPassword());
            customerDao.getCustomerIds().put(customer.getEmail(), counter);
            counter++;
            return customerDao.getCustomerList().get(customerDao.getCustomerIds().get(customer.getEmail()));
        } else
            return null;
    }

    public List<Customer> getCustomerList() {
        return customerDao.getCustomerList();
    }
}

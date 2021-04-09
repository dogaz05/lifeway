package org.academiadecodigo.pet_it.lifeway.lifewayApp.controllers;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
@RequestMapping(path = "/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*@GetMapping(path = {"/", ""})
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
    }*/



    @GetMapping( path = {"/list"})
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomerList());
        return "test";
    }


    /*@PostMapping(path = {"/savecustomer"})
    public Customer newCustomer(@RequestBody Customer customer) {
        if(customerService.addCustomer(customer) == null){
            return null;
        }
        return customerService.login(customer);
    }*/

    @GetMapping(path = "/create")
    public String createCustomer(Model m) {

        Customer customer = new Customer();
        m.addAttribute("customer", customer);
        return "newaccount";
    }

    @GetMapping()
    public String loginCustomer(Model m) {

        Customer customer = new Customer();
        m.addAttribute("customer", customer);
        return "main-view";
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute Customer customer) {

        if(customerService.addCustomer(customer) == null){
            return "main-view";
        }

        customerService.addCustomer(customer);
        return "sign-up";
    }

    @PostMapping(path = {"/login"})
    public String login(@ModelAttribute Customer customer) {

       return (customerService.login(customer) == null) ? "main-view" : "sign-up";
    }



}

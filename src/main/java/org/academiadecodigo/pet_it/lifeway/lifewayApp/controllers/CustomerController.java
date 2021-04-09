package org.academiadecodigo.pet_it.lifeway.lifewayApp.controllers;

import org.academiadecodigo.pet_it.lifeway.lifewayApp.model.Customer;
import org.academiadecodigo.pet_it.lifeway.lifewayApp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


    public void hardCodeCustomer() {

        Customer customer1 = new Customer();
        customer1.setEmail("luis@infelix.ateja");
        customer1.setPassword("lel");
        customer1.setFirstName("Luis");
        customer1.setLastName("Felix");
        customer1.setCity("Nova Gaia");
        customer1.setCountry("Portugal");
        customerService.addCustomer(customer1);

    }



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

    @GetMapping(path = {"", "/"})
    public String loginCustomer(Model m) {

        hardCodeCustomer();

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
        return "profile-page";
    }

    @PostMapping(path = {"/login"})
    public String login(@ModelAttribute Customer customer) {
       return (customerService.login(customer) == null) ? "main-view" : "profile-page";
    }


}

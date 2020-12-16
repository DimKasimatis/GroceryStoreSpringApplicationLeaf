/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.GroceryStoreSpringApplicationLeaf2.controllers;

import java.util.Optional;
import org.pcedu.GroceryStoreSpringApplicationLeaf2.entities.Customer;
import org.pcedu.GroceryStoreSpringApplicationLeaf2.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author George.Pasparakis
 */
@Controller
@RequestMapping("/")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    
    @RequestMapping("/customer")
    public String showCustomer(ModelMap view) {
        view.addAttribute("projectName", "Grocery Store");
        Optional<Customer> customer = customerService.findById(2);
        view.addAttribute("customer", customer);
        return("customer");
    }
    
    
}

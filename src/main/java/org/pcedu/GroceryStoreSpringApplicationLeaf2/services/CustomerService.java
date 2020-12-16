/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.GroceryStoreSpringApplicationLeaf2.services;

import java.util.Optional;
import org.pcedu.GroceryStoreSpringApplicationLeaf2.entities.Customer;
import org.pcedu.GroceryStoreSpringApplicationLeaf2.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dim.Kasimatis
 */
@Service("customerService")
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public Optional<Customer> findById(int id) {
        return customerRepo.findById(2);
    }
}

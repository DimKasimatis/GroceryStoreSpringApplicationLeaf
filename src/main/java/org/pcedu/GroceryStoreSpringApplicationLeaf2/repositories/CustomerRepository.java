/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.GroceryStoreSpringApplicationLeaf2.repositories;

import org.pcedu.GroceryStoreSpringApplicationLeaf2.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dim.Kasimatis
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}

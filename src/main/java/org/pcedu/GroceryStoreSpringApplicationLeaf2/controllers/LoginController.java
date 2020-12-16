/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.GroceryStoreSpringApplicationLeaf2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dim.Kasimatis
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping(value = {"/login", "/"},  method={RequestMethod.GET})
    public String login(ModelMap view) {
        view.addAttribute("projectName", "Grocery Store Leaf");
        return("login");
    }
}


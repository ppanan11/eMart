package com.emart.jpa.controller;

import com.emart.jpa.entity.BuyerEntity;
import com.emart.jpa.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    /**
     * get the buyer
     * @param username
     * @return
     */
    @GetMapping(value = "/{username}")
    BuyerEntity getBuyerByUsername(@PathVariable String username){
        return buyerService.getBuyerByUsername(username);
    }
}

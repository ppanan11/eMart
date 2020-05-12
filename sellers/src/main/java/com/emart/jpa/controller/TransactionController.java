package com.emart.jpa.controller;


import com.emart.jpa.entity.TransactionsEntity;
import com.emart.jpa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value= "/buyer")
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @GetMapping(value="transaction/{buyerId}")
    public List<TransactionsEntity> getTransactionByBuyer(@PathVariable Integer buyerId){
        return transactionService.getTransactionsByBuyer(buyerId);
    }

}

package com.emart.jpa.service;

import com.emart.jpa.entity.BuyerEntity;
import com.emart.jpa.entity.TransactionsEntity;

import java.util.List;

public interface TransactionService {

    /**
     * get a buyer by given username
     * @return
     */
    List<TransactionsEntity> getTransactionsByBuyer(int buyerId );
}

package com.emart.jpa.service.impl;

import com.emart.jpa.entity.TransactionsEntity;
import com.emart.jpa.repository.TransactionRepository;
import com.emart.jpa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    /**
     * return all transactions by buyer
     * @return
     */
    @Override
    public List<TransactionsEntity> getTransactionsByBuyer(int buyerId) {
        return transactionRepository.findTransactionsEntitiesByBuyerId(buyerId);
    }
}

package com.emart.jpa.repository;

import com.emart.jpa.entity.TransactionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionsEntity,Integer> {

    List<TransactionsEntity> findTransactionsEntitiesByBuyerId(int buyerId);
}

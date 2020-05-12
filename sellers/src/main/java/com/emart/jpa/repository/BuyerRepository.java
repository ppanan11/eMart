package com.emart.jpa.repository;

import com.emart.jpa.entity.BuyerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BuyerRepository extends JpaRepository<BuyerEntity,Integer> {


    BuyerEntity findBuyerEntityByUsername(String username);
}

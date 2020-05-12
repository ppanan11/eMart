package com.emart.jpa.service.impl;

import com.emart.jpa.entity.BuyerEntity;
import com.emart.jpa.repository.BuyerRepository;
import com.emart.jpa.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    BuyerRepository buyerRepository;
    /**
     * get buyer info by username
     * @param username
     * @return
     */
    @Override
    public BuyerEntity getBuyerByUsername(String username) {
        return buyerRepository.findBuyerEntityByUsername(username);
    }
}

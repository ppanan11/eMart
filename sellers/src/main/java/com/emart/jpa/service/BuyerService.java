package com.emart.jpa.service;

import com.emart.jpa.entity.BuyerEntity;

public interface BuyerService {

    /**
     * get a buyer by given username
     * @param username
     * @return
     */
    BuyerEntity getBuyerByUsername(String username);

}

package com.nextgen.ecommerce.stores.service.impl;

import com.nextgen.ecommerce.stores.entity.Store;
import com.nextgen.ecommerce.stores.repository.StoreRepository;
import com.nextgen.ecommerce.stores.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StoreServiceImpl is an implementation of the StoreService interface.
 * It provides the business logic for managing stores in the e-commerce system.
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public List<Store> getNearbyStores(String pinCode) {
        return storeRepository.findByPinCode(pinCode);
    }

    @Override
    public Store createStore(Store store) {
        return storeRepository.save(store);
    }
}

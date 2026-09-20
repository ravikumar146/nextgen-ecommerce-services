package com.nextgen.ecommerce.store.service;

import com.nextgen.ecommerce.store.entity.Store;

import java.util.List;

/**
 * StoreService is an interface that defines the contract for store-related business logic.
 * Implementations of this interface will provide methods for managing stores in the e-commerce system.
 */
public interface StoreService {

    List<Store> getNearbyStores(String pinCode);

    Store createStore(Store store);
}

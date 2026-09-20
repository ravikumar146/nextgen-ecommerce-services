package com.nextgen.ecommerce.store.repository;

import com.nextgen.ecommerce.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * StoreRepository is a Spring Data JPA repository interface for managing Store entities.
 * It provides CRUD operations and query methods for interacting with the underlying database.
 */
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    /**
     * Finds a list of stores by their pin code.
     *
     * @param pinCode the pin code to search for
     * @return a list of stores matching the given pin code
     */
    List<Store> findByPinCode(String pinCode);
}

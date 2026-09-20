package com.nextgen.ecommerce.store.controller;

import com.nextgen.ecommerce.store.entity.Store;
import com.nextgen.ecommerce.store.service.StoreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * StoreController is responsible for handling HTTP requests related to stores.
 * It provides endpoints for managing store-related operations in the e-commerce system.
 */
@Tag(name = "Stores", description = "Endpoints for managing stores")
@RestController
@RequestMapping("/api/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @Operation(summary = "Get nearby stores based on area pin code")
    @GetMapping("/{pinCode}/nearby")
    public ResponseEntity<List<Store>> getNearbyStores(@PathVariable String pinCode) {
        List<Store> nearbyStores = storeService.getNearbyStores(pinCode);
        return ResponseEntity.ok(nearbyStores);
    }

    @Operation(summary = "Create a new store")
    @PostMapping("/create")
    public ResponseEntity<Store> createStore(@RequestBody Store store) {
        Store createdStore = storeService.createStore(store);
        return ResponseEntity.status(201).body(createdStore);
    }
}

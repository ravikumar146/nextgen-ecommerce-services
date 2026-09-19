package com.nextgen.ecommerce.products.service;

import com.nextgen.ecommerce.products.entity.Product;

import java.util.List;

/**
 * Service interface for managing products.
 */

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    List<Product> searchProducts(String name);

    List<Product> getProductsByCategory(String category);

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}

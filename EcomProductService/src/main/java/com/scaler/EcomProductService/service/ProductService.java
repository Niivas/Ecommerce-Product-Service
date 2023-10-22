package com.scaler.EcomProductService.service;

import com.scaler.EcomProductService.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String id);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(String id);
}

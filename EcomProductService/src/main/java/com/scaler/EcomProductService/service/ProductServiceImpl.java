package com.scaler.EcomProductService.service;

import com.scaler.EcomProductService.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(String id) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(String id) {

    }
}

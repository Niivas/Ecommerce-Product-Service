package com.scaler.EcomProductService.service;

import com.scaler.EcomProductService.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl<RestTemplate> implements ProductService {

    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List getAllProducts() {
        org.springframework.web.client.RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("https://fakestoreapi.com/products", List.class);
        return responseEntity.getBody();
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

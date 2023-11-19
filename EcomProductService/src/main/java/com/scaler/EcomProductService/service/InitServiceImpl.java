package com.scaler.EcomProductService.service;

import com.scaler.EcomProductService.model.Category;
import com.scaler.EcomProductService.model.Price;
import com.scaler.EcomProductService.model.Product;
import com.scaler.EcomProductService.model.ProductOrder;
import com.scaler.EcomProductService.repository.CategoryRepository;
import com.scaler.EcomProductService.repository.OrderRepository;
import com.scaler.EcomProductService.repository.PriceRepository;
import com.scaler.EcomProductService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitServiceImpl implements InitService{
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private OrderRepository orderRepository;
    private PriceRepository priceRepository;

    public InitServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository, OrderRepository orderRepository, PriceRepository priceRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.orderRepository = orderRepository;
        this.priceRepository = priceRepository;
    }

    public void initialize() {
        Category electronics = new Category();
        electronics.setCategoryName("Electronics");
        electronics = categoryRepository.save(electronics); // upsert operation in the database table category (if category exists, update it, else insert it)

        Price IphonePrice = new Price();
        IphonePrice.setCurrency("INR");
        IphonePrice.setPrice(100000);
        Price savedIphonePrice = priceRepository.save(IphonePrice);

        Price SamsungPrice = new Price();
        SamsungPrice.setCurrency("INR");
        SamsungPrice.setPrice(50000);
        Price savedSamsungPrice = priceRepository.save(SamsungPrice);

        Price OnePlusPrice = new Price();
        OnePlusPrice.setCurrency("INR");
        OnePlusPrice.setPrice(60000);
        Price savedOnePlusPrice = priceRepository.save(OnePlusPrice);

        Product iphone = new Product();
        iphone.setTitle("Iphone");
        iphone.setDescription("Iphone 12");
        iphone.setImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.apple.com%2Fin%2Fiphone-12%2F&psig=AOvVaw0QZ4Z3Z3Z3Z3Z3Z3Z3Z3Z3&ust=1629789850008000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjQ4ZqH5_ICFQAAAAAdAAAAABAD");
        iphone.setPrice(savedIphonePrice);
        iphone.setCategory(electronics);
        iphone = productRepository.save(iphone);

        Product samsung = new Product();
        samsung.setTitle("Samsung");
        samsung.setDescription("Samsung S21");
        samsung.setImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.samsung.com%2Fin%2Fsmartphones%2Fgalaxy-s21-5g%2F&psig=AOvVaw0QZ4Z3Z3Z3Z3Z3Z3Z3Z3Z3&ust=1629789850008000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjQ4ZqH5_ICFQAAAAAdAAAAABAJ");
        samsung.setPrice(savedSamsungPrice);
        samsung.setCategory(electronics);
        samsung = productRepository.save(samsung);

        Product onePlus = new Product();
        onePlus.setTitle("OnePlus");
        onePlus.setDescription("OnePlus 9");
        onePlus.setImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.oneplus.in%2F&psig=AOvVaw0QZ4Z3Z3Z3Z3Z3Z3Z3Z3Z3&ust=1629789850008000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjQ4ZqH5_ICFQAAAAAdAAAAABAP");
        onePlus.setPrice(savedOnePlusPrice);
        onePlus.setCategory(electronics);
        onePlus = productRepository.save(onePlus);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setProduct(List.of(iphone, samsung, onePlus));
        productOrder = orderRepository.save(productOrder);
    }
}

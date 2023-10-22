package com.scaler.EcomProductService.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String id;
    private String title;
    private String description;
    private String category;
    private String image;
    private double price;
}

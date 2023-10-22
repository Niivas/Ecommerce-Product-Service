package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    private String name;
    private String description;
    private String category;
    private String image;
    private double price;

    public ProductRequestDTO() {
    }

    public ProductRequestDTO(String name, String description, String category, String image, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
        this.price = price;

    }

}

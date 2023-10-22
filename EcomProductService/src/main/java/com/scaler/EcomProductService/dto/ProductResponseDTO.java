package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private String id;
    private String name;
    private String description;
    private String category;
    private String image;
    private double price;
    public ProductResponseDTO() {
    }

    public ProductResponseDTO(String id,String name, String description, String category, String image, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
        this.price = price;
    }

}

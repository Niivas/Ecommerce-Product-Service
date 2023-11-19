package com.scaler.EcomProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    @OneToOne
    private Price price;
    @ManyToOne
    private Category category;
}
/*
  Product - Category -> Many to One
    1-1
    M - 1
 */
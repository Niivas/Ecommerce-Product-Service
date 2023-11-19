package com.scaler.EcomProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class ProductOrder extends BaseModel{
    @ManyToMany
    private List<Product> product;
}

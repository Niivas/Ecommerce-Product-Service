package com.scaler.EcomProductService.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Price extends BaseModel{
    private double price;
    private String currency;
    private double discount;
    private double tax;
}

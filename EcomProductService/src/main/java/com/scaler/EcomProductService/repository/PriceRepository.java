package com.scaler.EcomProductService.repository;

import com.scaler.EcomProductService.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
public interface PriceRepository extends JpaRepository<Price, UUID> {
}
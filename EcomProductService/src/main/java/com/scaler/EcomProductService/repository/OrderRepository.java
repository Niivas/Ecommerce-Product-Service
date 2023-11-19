package com.scaler.EcomProductService.repository;

import com.scaler.EcomProductService.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
public interface OrderRepository extends JpaRepository<ProductOrder, UUID> {
}
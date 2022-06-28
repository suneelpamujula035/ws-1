package com.product.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.entity.OrderDetailsEntity;

public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Serializable> {

}

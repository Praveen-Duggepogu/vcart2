package com.vcart.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.vcart.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {


}

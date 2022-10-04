package com.vcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcart.entity.AddtoCart;
import com.vcart.entity.Product;

public interface AddtocartDao extends JpaRepository<AddtoCart, Integer> {

	AddtoCart save(Product product, AddtoCart addtoCart);

}

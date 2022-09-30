package com.vcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcart.entity.AddtoCart;

public interface AddtocartDao extends JpaRepository<AddtoCart, Integer> {

}

package com.vcart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcart.dao.AddtocartDao;
import com.vcart.entity.AddtoCart;

@Service
public class AddtocartService {
	
	@Autowired
	private AddtocartDao addtocartdao;
	
	public void addToCart(AddtoCart product) {
		addtocartdao.save(product);
		
	}

	
	public List<AddtoCart> mycart( AddtoCart product){
		return  addtocartdao.findAll();
		 
	}

}
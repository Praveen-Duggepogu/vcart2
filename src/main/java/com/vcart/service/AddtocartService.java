package com.vcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcart.dao.AddtocartDao;
import com.vcart.entity.AddtoCart;

@Service
public class AddtocartService {
	
	@Autowired
	private AddtocartDao addtocartdao;
	
	public void addToCart(AddtoCart cart, String username) {
		addtocartdao.save()
		
	}

}

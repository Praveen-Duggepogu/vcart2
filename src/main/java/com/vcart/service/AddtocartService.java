package com.vcart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcart.dao.AddtocartDao;
import com.vcart.entity.AddtoCart;
import com.vcart.entity.Product;

@Service
public class AddtocartService {
	
	@Autowired
	private AddtocartDao addtocartdao;
	
	
	public AddtoCart addToCart(Product product, AddtoCart addtoCart) {
		addtoCart.setPname(product.getPname());
		addtoCart.setPprice(product.getPprice());
		return addtocartdao.save(product,addtoCart);
		
	}

	
	public List<AddtoCart> mycart( AddtoCart product){
		return  addtocartdao.findAll();
		 
	}

}
package com.vcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcart.entity.Product;
import com.vcart.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	
	@Autowired
	private  ProductService proservice;
	
	@PostMapping("/save")
	public boolean saveProduct(@RequestBody Product product) {
		proservice.saveProduct(product);
		return true;
	}

}

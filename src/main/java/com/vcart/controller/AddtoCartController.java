package com.vcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcart.entity.AddtoCart;
import com.vcart.service.AddtocartService;

@RestController
@RequestMapping("/api/addtocart")
public class AddtoCartController {
	
	@Autowired
	private AddtocartService service;
	
	
	@PostMapping("/save")
	 public void addToCart( @RequestBody AddtoCart product) {
		service.addToCart(product);
	}
	

	@GetMapping("/list")
	public List<AddtoCart> mycart(@RequestBody AddtoCart product){
		return service.mycart(product);
	}
}

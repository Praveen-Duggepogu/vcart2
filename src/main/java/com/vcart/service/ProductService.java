package com.vcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcart.dao.ProductDao;
import com.vcart.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productdao;
	
	public boolean saveProduct(Product product) {
	productdao.save(product);
	return true;
	}
	
	public List<Product> listProductList(Product product){
		return productdao.findAll();
	}

	public String updateProduct(Product product) {
		productdao.save(product);
		return "update succesfully";
	}
	
	public String deleteById(Product product ,int id) {
		productdao.deleteById(id);
		return "deleted successfully";
	}
}

package com.saswat.springboot.springrestapimvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saswat.springboot.springrestapimvc.dao.ProductDao;
import com.saswat.springboot.springrestapimvc.model.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao dao;
	
	public Product getProduct(Integer id) {
		return dao.getProduct(id);
	}
	
	public Product saveProduct(Product product) {
		return dao.saveProduct(product);
	}
}

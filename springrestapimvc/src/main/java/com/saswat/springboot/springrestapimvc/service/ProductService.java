package com.saswat.springboot.springrestapimvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saswat.springboot.springrestapimvc.dao.ProductDao;
import com.saswat.springboot.springrestapimvc.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao dao;

	public Product readProduct(Integer id) {
		return dao.readProduct(id);
	}

	public Product createProduct(Product product) {
		return dao.createProduct(product);
	}

	public List<Product> readProducts() {
		return dao.readProducts();
	}

	public Product updateProduct(Product product) {
		return dao.updateProduct(product);
	}
	
	public void deleteProduct(Integer id) {
		dao.deleteProduct(id);
	}
}

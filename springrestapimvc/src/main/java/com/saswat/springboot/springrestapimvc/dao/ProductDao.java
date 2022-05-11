package com.saswat.springboot.springrestapimvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saswat.springboot.springrestapimvc.model.Product;
import com.saswat.springboot.springrestapimvc.repo.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository repository;

	public Product getProduct(Integer id) {
		return repository.findById(id).get();
	}
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
}

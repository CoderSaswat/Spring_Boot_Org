package com.saswat.springboot.springrestapimvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saswat.springboot.springrestapimvc.model.Product;
import com.saswat.springboot.springrestapimvc.repo.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository repository;

	public Product readProduct(Integer id) {
		return repository.findById(id).get();
	}
	
	public Product createProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> readProducts(){
		return repository.findAll();
	}
	
	public Product updateProduct(Product product) {
		return repository.save(product);
	}
	
	public void deleteProduct(Integer id) {
		repository.deleteById(id);
	}
	
	
}

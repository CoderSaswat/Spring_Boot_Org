package com.saswat.springboot.springrestapimvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saswat.springboot.springrestapimvc.model.Product;
import com.saswat.springboot.springrestapimvc.repo.ProductRepository;
import com.saswat.springboot.springrestapimvc.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping("/getProduct/{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		return service.getProduct(id);
	}
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
}

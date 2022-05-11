package com.saswat.springboot.springrestapimvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product) {
		return service.createProduct(product);
	}

	@GetMapping("/readProduct/{id}")
	public Product readProduct(@PathVariable("id") Integer id) {
		return service.readProduct(id);
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		service.deleteProduct(id);
	}

	@GetMapping("/readProducts")
	public List<Product> readProducts() {
		return service.readProducts();
	}

}

package com.saswat.springboot.springrestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saswat.springboot.springrestapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

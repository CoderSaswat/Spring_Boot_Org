package com.saswat.springboot.springrestapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.saswat.springboot.springrestapi.entities.Product;

@SpringBootTest
class SpringrestapiApplicationTests {
	@Value("${springrestapi.services.url}")
	private String baseUrl;

	@Test
	void testGetProduct() {
		System.out.println(baseUrl);
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl + "/5", Product.class);
		System.out.println(product);
	}

	@Test
	void testPostProduct() {
		Product product1 = new Product();
		product1.setName("chafffrger");
		product1.setDescription("33w comdrrdpany");
		product1.setPrice(46);

		RestTemplate restTemplate = new RestTemplate();
		Product newProduct = restTemplate.postForObject(baseUrl, product1, Product.class);
		System.out.println(newProduct);
	}

	@Test
	void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl + "/9", Product.class);
		product.setPrice(2);
		product.setDescription("i will buy samsung AC");
		restTemplate.put(baseUrl, product);
	}

	@Test
	void testDeleteProduct() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(baseUrl + "/13");
	}

}

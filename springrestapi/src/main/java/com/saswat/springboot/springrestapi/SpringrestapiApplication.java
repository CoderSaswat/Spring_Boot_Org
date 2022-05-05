package com.saswat.springboot.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringrestapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);
	}

}

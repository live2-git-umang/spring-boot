package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.live.model.Product;

@RestController
public class ProductController {	
	List<Product> products = new ArrayList<Product>();
	@GetMapping("/products")
	public List<Product> getProducts() {
		// ideally connect to service, from service to repo, repo to db and fetch the
		// data.
		// for convenience create a stub collection
		products.add(new Product(100l, "SpringBoot.", "Book", 500.50f));
		products.add(new Product(101l, "Angular", "Book", 555.50f));
		return products;
	}
}

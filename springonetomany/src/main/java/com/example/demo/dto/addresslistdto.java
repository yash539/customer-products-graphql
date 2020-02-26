package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Product;

public class addresslistdto {
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "addresslistdto [products=" + products + "]";
	}

	public addresslistdto(List<Product> products) {
		super();
		this.products = products;
	}

	public addresslistdto() {
		super();
	}
	
	

}

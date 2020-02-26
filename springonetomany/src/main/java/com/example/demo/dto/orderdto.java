package com.example.demo.dto;

import com.example.demo.model.Customer;

public class orderdto {

	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "orderdto [customer=" + customer + "]";
	}

	public orderdto(Customer customer) {
		super();
		this.customer = customer;
	}

	public orderdto() {
		super();
	}
	
}

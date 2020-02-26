package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.orderdto;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.Customerrepo;

@Service
public class userservice {

	
	@Autowired
	Customerrepo repo;

	public Customer addanother(int id, List<Product> list) {
		// TODO Auto-generated method stub
	
		if(repo.existsById(id))
		{
			Customer c1 =repo.findById(id).get();
			c1.getProducts().addAll(list);
			
			return repo.save(c1);
		}
		else
		{
			return null;
		}
		
	}

	public List<Customer> getcustomers() {
		// TODO Auto-generated method stub
	 
	        return repo.findAll();
	    
	}
}

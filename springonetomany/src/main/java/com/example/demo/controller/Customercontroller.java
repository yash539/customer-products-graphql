package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.dto.Customerdetailsdto;
import com.example.demo.dto.addresslistdto;
import com.example.demo.dto.customerbyproductid;
import com.example.demo.dto.getcnameandpname;
import com.example.demo.dto.orderdto;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.Customerrepo;
import com.example.demo.repository.Productrepo;
import com.example.demo.services.userservice;

@RestController
@Component
public class Customercontroller implements GraphQLQueryResolver{
	@Autowired
	private Customerrepo customerrepo;
	@Autowired
    userservice userservice1;
	@Autowired
	private Productrepo productrepo;
    @PostMapping("/placeorder")
	public Customer placeorder(@RequestBody orderdto order)
	{
		return customerrepo.save(order.getCustomer());
	}
//		@GetMapping("/findorder")
//	public List<Customer> findall()
//	{
//		return customerrepo.findAll();
//	}
		
		@GetMapping("/findbynames/{id}")
		public List<getcnameandpname> getinfo(@PathVariable("id")int id)		
		{
			return customerrepo.getinfo(id);
		}
		// add products to already existed customers
	@PostMapping("/addanotherproduct/{id}")
	public Customer addanotheraddress(@PathVariable("id")int id,@RequestBody addresslistdto add1)
	{
		return userservice1.addanother(id,add1.getProducts());
	}
	// get customer name by product id
//	@GetMapping("/customer/product/{id}")
//	public List<customerbyproductid> getcustomer(@PathVariable("id") int pid)
//	{
//		return customerrepo.getcustomer(pid);
//	}
	// get all customers by product name
	@GetMapping("/customers/product/{name}")
	public List<Customerdetailsdto> getcustomerbypname(@PathVariable("name") String pname)
	{
return customerrepo.getcustomerbypname(pname);
	}
	
	// graphql 
	public List<Customer> getCustomers()
	{
		return userservice1.getcustomers();
	}
	public List<Product> getProducts()
	{
		return productrepo.findAll();
	}
	public Customer getCustomer(final int id) {
        return customerrepo.findById(id).get();
    }
	
}

package com.example.demo.resolver;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Customer;
import com.example.demo.repository.Customerrepo;
import com.example.demo.repository.Productrepo;


@Component
public class Mutation implements GraphQLMutationResolver{
	@Autowired
private Customerrepo customerrepo;
	@Autowired
	private Productrepo productrepo;
	public Customer addCustomerbygraphql( Customer customer)
	{
	
		
		return customerrepo.save(customer);
	}
	public Boolean deleteCustomerbygraphql(int id)
	{
		if(customerrepo.existsById(id))
		{
			customerrepo.deleteById(id);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// delete product by pid
	public Boolean deleteProductbygraphql(int id)
	{
		if(productrepo.existsById(id))
		{
			productrepo.deleteById(id);
			return true;
		}
		else
		{
			return false;
		}
			
	}
	//update
	public Customer updateCustomerbygraphql(int id,Customer customer)
	{
		if(customerrepo.existsById(id))
		{	
			Customer fetchedcustomer = customerrepo.findById(id).get();
			customer.setId(id);
			customer.setProducts(fetchedcustomer.getProducts());
			return customerrepo.save(customer);
		}
		return null;
	}
	
	
}

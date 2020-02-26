package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.Customerdetailsdto;
import com.example.demo.dto.customerbyproductid;
import com.example.demo.dto.getcnameandpname;
import com.example.demo.dto.orderdto;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;

public interface Customerrepo extends JpaRepository<Customer, Integer> {

	@Query("select new com.example.demo.dto.getcnameandpname(c.name,p.pname) from Customer c JOIN c.products p where c.id=:id")
	public List<getcnameandpname> getinfo(@Param("id") int id);

    @Query("select new com.example.demo.dto.customerbyproductid(p.pid,c.name) from Customer c JOIN c.products p where p.id=:id ")
    
	public List<customerbyproductid> getcustomer(@Param("id") int pid);
	
	 @Query("select new com.example.demo.dto.Customerdetailsdto(c.name,c.email,c.gender) from Customer c JOIN c.products p where p.pname=:name ")
	    
		public List<Customerdetailsdto> getcustomerbypname(@Param("name") String pname);

}  
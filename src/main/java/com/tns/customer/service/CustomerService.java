package com.tns.customer.service;

import java.util.List;
import java.util.Optional;

import com.tns.customer.entities.User;

public interface CustomerService {
	//save operation
	User saveCustomer(User user);
	
	//Read  operation->all list
	List<User> fetchCustomerList();
	
	//fetch by id
	Optional<User> fetchCustomerById(int id);
	
	//Update
	User updateCustomer(User user,int id);
	
	//delete
	void deleteCustomerById(int id);

}

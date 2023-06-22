package com.tns.customer.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.customer.dao.UserRepository;
import com.tns.customer.entities.User;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
   private UserRepository userRepository;
	
	//save customer
	@Override
	public User saveCustomer(User user) {
		return userRepository.save(user);
	}

	//fetch customer all
	@Override
	public List<User> fetchCustomerList() {
		return (List<User>) userRepository.findAll();
	}

	//fetch customer by id
	@Override
	public Optional<User> fetchCustomerById(int id) {
		return userRepository.findById(id);
	}
	
	
	//update customer
	@Override
	public User updateCustomer(User user, int id) {
		User uDb=userRepository.findById(id).get();
		
		if (Objects.nonNull(user.getName())
	            && !"".equalsIgnoreCase(
	                user.getName())) {
	            uDb.setName(
	                user.getName());
	        }
	 
	        if (Objects.nonNull(
	                user.getPhone())) {
	            uDb.setPhone(
	                user.getPhone());
	        }
	 
	   
	        return userRepository.save(uDb);
	    }
	
	
   //delete customer by id
	@Override
	public void deleteCustomerById( int id) {
		userRepository.deleteById(id);
	}

	

}

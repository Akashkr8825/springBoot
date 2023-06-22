package com.tns.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.customer.entities.User;
import com.tns.customer.service.CustomerService;

@RestController
public class UserController {
	@Autowired
	private CustomerService customerService;

	//save
	@PostMapping("/user")
	public User saveUser(@Validated @RequestBody User user) {
		return customerService.saveCustomer(user);
	}
	
	//read all details
	@GetMapping("/user")
	public List<User> fetchCustomerList(){
		return customerService.fetchCustomerList();
	}
	
	//read by id
	@GetMapping("/user/{id}")
	public Optional<User> fetchCustomerById(@PathVariable("id") int id){
		return customerService.fetchCustomerById(id);
	}
	
	//update
	@PutMapping("/user/{id}")
	public User updateCustomer(@RequestBody User user,@PathVariable("id") int id) {
		return customerService.updateCustomer(user, id);
		
	}
	
	//delete
	@DeleteMapping("/user/{id}")
	public String deleteCustomerById(@PathVariable("id")int id) {
		customerService.deleteCustomerById(id);
	    return "deleted successfully";
	}
}

package com.tns.customer.dao;

import org.springframework.data.repository.CrudRepository;

import com.tns.customer.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

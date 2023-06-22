package com.tns.customer.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long Phone;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Phone=" + Phone + "]";
	}

	public User() {
		
	}
	
	public User(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		Phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}

}

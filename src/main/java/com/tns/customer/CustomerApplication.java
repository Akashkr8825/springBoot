package com.tns.customer;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tns.customer.dao.UserRepository;
import com.tns.customer.entities.User;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(CustomerApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
	
//	User user=new User();
//	user.setName("Ravi");
//	user.setPhone(8826298681l);
//	
//	User u=userRepository.save(user);
//	System.out.println(u);
	
//	User user=new User();
//	user.setName("Mukesh");
//	user.setPhone(756379880);
//	
//	User user1=new User();
//	user1.setName("Aalok");
//	user1.setPhone(763279880);
//	
//	List<User> users=List.of(user,user1);
//	 Iterable<User> result=userRepository.saveAll(users);
//	 result.forEach(us->{
//		 System.out.println(users);
//	 });
//	 System.out.println(result);
//	 
	 
	}

}

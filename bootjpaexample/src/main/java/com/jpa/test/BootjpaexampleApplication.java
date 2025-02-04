package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		User user = new User();
//		user.setName("Sumant Kumar Sharma");
//		user.setCity("Delhi");
//		user.setStatus("I am java programmer");
//		
//		User user1 = userRepository.save(user);
//		
//		System.out.println(user1);
//		Create object of User
		
//		User user1 = new User();
//		user1.setName("Uttam");
//		user1.setCity("City1");
//		user1.setStatus("Python Programmer");
//		
//		User user2 = new User();
//		user2.setName("Usha");
//		user2.setCity("City2");
//		user2.setStatus("Java Programmer");

//		Saving single user
//		User resultUser = userRepository.save(user2);
//		List<User> users = List.of(user1,user2);
//		save multiple objects
//		Iterable<User> result = userRepository.saveAll(users);
		
//		result.forEach(user -> {
//			System.out.println(user);
//		});
		
//		System.out.println("saved user" + result);
		
//		System.out.println("done");
		
//		update the user of id 603
//		Optional<User> optional = userRepository.findById(603);
//		User user = optional.get();
//		
//		user.setName("Rahul Kumar");
//		
//		User result = userRepository.save(user);
//		System.out.println(result);
		
//		User user = optional.get();
//		System.out.println(user);
		
//		how to get the data
//		findById(id) - return Optional Containing your data
		
//		Optional<User> optional = userRepository.findById(603);
//		User user = optional.get();
//		User user = optional.get();
//		System.out.println(user);
		
//		how to get the data
//		findById(id) - return Optional Containing your data
		
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(new Consumer<User>() {
//			
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub		
//				System.out.println(t);
//			}
//		});
		
//		itr.forEach(user -> {System.out.println(user);});

//		Deleting the user element
//		userRepository.deleteById(602);
//		System.out.println("deleted");
		
//		Iterable<User> allusers = userRepository.findAll();
//		
//		allusers.forEach(user->System.out.println(user));
		
//		userRepository.deleteAll(allusers);
			
//		List<User> users = userRepository.findByNameAndCity("Sumant Kumar Sharma", "Delhi");
//		
//		users.forEach(e -> System.out.println(e));
		
//		List<User> allUsers = (List<User>) userRepository.findAll();
//		
//		allUsers.forEach(System.out::println);
//		
//		System.out.println("______________________________");
		
//		List<User> userByName = userRepository.getUserByName("Rahul Kumar", "Noida");
		
//		userByName.forEach(e -> {
//			System.out.println(e);
//		});
//		userByName.forEach(System.out::println);
		
		System.out.println("_______________________________________");
		userRepository.getAllUser().forEach(e -> System.out.println(e));;
	}
}

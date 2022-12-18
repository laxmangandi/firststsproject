package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirststsprojectApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(FirststsprojectApplication.class, args);
		
		Person person = con.getBean(Person.class);
		person.Eat();
		
		
	//	ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		
		// new AnnotationConfigApplicationContext(Config.class); this right hand portion or this line will create ioc container
	
	//	Person person = con.getBean(Person.class);
	//	person.Speak(); // i can able to speak !!
		
	//	person.Eat(); // this will give NPE  // java.lang.NullPointerException: Cannot invoke "com.sts.Food.recipes()" because "this.food" is null
 	//	Your food is ready you can eat after autowiring then only it will give output bcz bean is created in container 
	//  but still person class and food class relation is not done.

	
	
	}

}

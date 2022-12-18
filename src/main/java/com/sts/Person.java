package com.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired   
	private Food food;

	// if we don't want to use autowired annotation, remove annotation from above food variable then we can create constructor by using this
	// we can inject the property in config class in Person method as we wrote in Config class
	public Person(Food food) {
		super();
		this.food = food;
	}

	public void Speak() {
		System.out.println("i can able to speak !!");
	}

	public void Eat() {
		food.recipes();
	}
}

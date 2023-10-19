package com.test.vimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

	private String id;
	private String name;
	private Integer age;
	private Double salary;

	public Person() {

	}

	public Person(String id, String name, Integer age,Double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public static void main(String args[]) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("1", "Ram", 50,2434.32));
		personList.add(new Person("2", "Laxman", 40,5434.54));
		personList.add(new Person("3", "seeta", 39,5343.65));
		personList.add(new Person("4", "asd", 35,3546.65));
		personList.add(new Person("5","fsd",29,4565.54));
		
		/*
		 * personList.stream().forEach(p-> {
		 * 
		 * if(p.getAge()<=35) { System.out.println(" Name " + p.getName()+" Age " +
		 * p.getAge()); } });
		 */
		
		personList.stream().forEach(p->{
			
			if(p.getSalary()<4000) {
				System.out.println(" Name " +p.getName()+ " Salary  "+ p.getSalary());
			}
		});
		

		 System.out.println(" ------------------------");
		 //personMap.forEach((key,value)->System.out.println(" Name " +value.getName()+ "Age "+ value.getAge()));
		// 1st way
		personList.stream().forEach(person -> {

			if (person.getAge() >= 39) {

				System.out.println(" " + person.getAge());
			}
		});

		// 2nd way	using lambda
	  //personList.stream().filter(person->person.getAge()>=39).forEach(person->System.out.println(person.getAge()));

	  
	  personList.stream().filter(person -> person.getSalary()>=100).forEach(person->System.out.println(person.getName()));
		
	  // 
		Map<Integer,Person> personMap = new HashMap<>();
		
		personMap.put(1,new Person("1", "Ram", 50,2434.32));
		personMap.put(2,new Person("2", "Laxman", 40,5434.54));
		personMap.put(3,new Person("3", "seeta", 39,5343.65));
		
		
		
		
	}
}

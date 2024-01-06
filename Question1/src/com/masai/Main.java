package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee(1,"Aman",26));
		empList.add(new Employee(2,"Amol",23));		
		empList.add(new Employee(3,"Rajesh",35));
		empList.add(new Employee(4,"Mohan",40));
		empList.add(new Employee(5,"Sumit",28));
		empList.add(new Employee(6,"Komal",24));
		empList.add(new Employee(7,"Pramod",23));
		empList.add(new Employee(8,"Raja",26));
		empList.add(new Employee(9,"Suman",45));
		empList.add(new Employee(10,"Radha",35));
		List<Employee> filteredEmployee= empList.stream().filter(e->e.getName().startsWith("A")).
				filter(e->e.getId()%2!=0).
				filter(e->e.getAge()%2==0).collect(Collectors.toList());
		
		/*
		 *
		 */
		 List<Employee> ans= empList.stream().filter(e->e.getName().startsWith("A")&& e.getAge()%2==0 && e.getId()%2!=0).collect(Collectors.toList());
		filteredEmployee.stream().forEach(System.out::println);
		ans.stream().forEach(System.out::println);
	}
}

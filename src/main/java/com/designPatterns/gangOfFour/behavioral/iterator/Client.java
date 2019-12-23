package com.designPatterns.gangOfFour.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.designPatterns.gangOfFour.behavioral.iterator.util.Employee;

public class Client {

	public static void main(String[] args) {
		List<Employee> employees = generateEmployees();
		
		// External Iterators
		ListIterator<Employee> listIterator = new ListIterator<>(employees);
		ReverseListIterator<Employee> reverseListIterator = new ReverseListIterator<>(employees);

		System.out.println("List iterator:");
		printEmployees(listIterator);
		System.out.println("\nReverse List iterator:");
		printEmployees(reverseListIterator);
		
		
		// Internal Iterators
		// Note how the client doesn't specify the iteration loop.
		// The entire iteration	logic can be reused. This is the
		// primary benefit of an internal iterator.
		PrintNEmployees printNEmployees = new PrintNEmployees(employees, 3);
		System.out.println("\nPrint N Employees internal iterator:");
		printNEmployees.traverse();
	}
	
	private static void printEmployees (Iterator<Employee> i) {
		for (i.first(); !i.isDone (); i.next()) {
			i.currentItem().print();
		}
	}
	
	private static List<Employee> generateEmployees() {
		List<Employee> employees = new ArrayList<>();
		Employee employee1 = new Employee("employee1");
		Employee employee2 = new Employee("employee2");
		Employee employee3 = new Employee("employee3");
		Employee employee4 = new Employee("employee4");
		Employee employee5 = new Employee("employee5");
		employees.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
		return employees;
	}
}

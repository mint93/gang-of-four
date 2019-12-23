package com.designPatterns.gangOfFour.behavioral.iterator.util;

public class Employee {

	private String name;
	
	public Employee(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Employee name: " + name);
	}
}

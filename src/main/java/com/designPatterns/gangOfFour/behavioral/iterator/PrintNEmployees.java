package com.designPatterns.gangOfFour.behavioral.iterator;

import java.util.List;

import com.designPatterns.gangOfFour.behavioral.iterator.util.Employee;

public class PrintNEmployees extends ListTraverser<Employee> {
	private int total;
	private	int count;

	public PrintNEmployees(List<Employee> employees, int n) {
		super(employees);
		this.total = n;
		this.count = 0;
	}
		
	@Override
	protected boolean processItem(Employee employee) {
		count++;
		employee.print();
		return count < total;
	}
	
}
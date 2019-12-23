package com.designPatterns.gangOfFour.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

// Context - contains information that's global to the interpreter.
// It is used at each node in the interpret operation to store
// and access the state of the interpreter.
public class Context {
	
	private Map<VariableExpression, Boolean> variableExpressions = new HashMap<>();
	
	public boolean lookup(String name) {
		return variableExpressions.entrySet().stream()
				.filter(entry -> entry.getKey().getName().equals(name))
				.map(entry -> entry.getValue())
				.findFirst()
				.orElseThrow(() -> new NoSuchElementException());
	}
	void assign(VariableExpression variableExpression, boolean value) {
		variableExpressions.put(variableExpression, value);
	}
}
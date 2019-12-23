package com.designPatterns.gangOfFour.behavioral.interpreter;

import java.util.Objects;

// TerminalExpression - implements an interpret operation associated
//with terminal symbols in the grammar. An instance is required for
//every terminal symbol in a sentence.
class VariableExpression implements BooleanExpression {
	private String name;
	
	public VariableExpression(String name) {
		this.name = Objects.requireNonNull(name);
	}
	@Override
	public boolean evaluate(Context context) {
		return context.lookup(name);
	}
	@Override
	public BooleanExpression replace(String name, BooleanExpression booleanExpression) {
		if (this.name.equals(name)) {
			return booleanExpression.copy();
		} else {
			return new VariableExpression(this.name);
		}
	}
	@Override
	public BooleanExpression copy() {
		return new VariableExpression(name);
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof VariableExpression)) {
			return false;
		}
		VariableExpression other = (VariableExpression) obj;
		return Objects.equals(name, other.getName());
	}
}
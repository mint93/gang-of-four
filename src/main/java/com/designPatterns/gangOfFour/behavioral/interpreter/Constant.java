package com.designPatterns.gangOfFour.behavioral.interpreter;

// TerminalExpression - implements an interpret operation associated
// with terminal symbols in the grammar. An instance is required for
// every terminal symbol in a sentence.
public class Constant implements BooleanExpression {
	private boolean value;
	
	public Constant(boolean value) {
		this.value = value;
	}
	@Override
	public boolean evaluate(Context context) {
		return value;
	}
	@Override
	public BooleanExpression replace(String name, BooleanExpression booleanExpression) {
		return copy();
	}
	@Override
	public BooleanExpression copy() {
		return new Constant(value);
	}
}
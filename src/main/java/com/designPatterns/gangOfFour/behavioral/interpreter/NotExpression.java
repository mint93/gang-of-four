package com.designPatterns.gangOfFour.behavioral.interpreter;

// NonterminalExpression - one such class is required for every
// rule in the grammar. It maintains instance variables of type
// AbstractExpression for each of the symbols.
// It implements an Interpret operation for nonterminal symbols in
// the grammar.
class NotExpression implements BooleanExpression {
	private BooleanExpression operand;
		
	public NotExpression(BooleanExpression booleanExpression) {
		this.operand = booleanExpression;
	}

	@Override
	public boolean evaluate(Context context) {
		return !operand.evaluate(context);
	}

	@Override
	public BooleanExpression replace(String name, BooleanExpression booleanExp) {
		return new NotExpression(operand.replace(name, booleanExp));
	}

	@Override
	public BooleanExpression copy() {
		return new NotExpression(operand.copy());
	}
	
	
}
package com.designPatterns.gangOfFour.behavioral.interpreter;

// NonterminalExpression - one such class is required for every
// rule in the grammar. It maintains instance variables of type
// AbstractExpression for each of the symbols.
// It implements an Interpret operation for nonterminal symbols in
// the grammar.
class OrExpression implements BooleanExpression {
	private BooleanExpression operand1;
	private	BooleanExpression operand2;
		
	public OrExpression(BooleanExpression booleanExpression1, BooleanExpression booleanExpression2) {
		this.operand1 = booleanExpression1;
		this.operand2 = booleanExpression2;
	}

	@Override
	public boolean evaluate(Context context) {
		return operand1.evaluate(context) ||
			   operand2.evaluate(context);
	}

	@Override
	public BooleanExpression replace(String name, BooleanExpression booleanExp) {
		return new OrExpression(operand1.replace(name, booleanExp),
								 operand2.replace(name, booleanExp));
	}

	@Override
	public BooleanExpression copy() {
		return new OrExpression(operand1.copy(), operand2.copy());
	}
	
	
}
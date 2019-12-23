package com.designPatterns.gangOfFour.behavioral.interpreter;

// AbstractExpression - declares an abstract interpret operation that
// is common to all nodes in the abstract syntax tree. Interpret takes
// as an argument the context in which to interpret the expression.
public interface BooleanExpression {
	// You don't have to define the interpret operation in the expression classes.
	// If it's common to create a new interpreter, then it's better to use the
	// Visitor pattern to put Interpret in a separate "visitor" object.
	public boolean evaluate(Context context);
	
	// replace produces a new Boolean expression by replacing a variable with an
	// expression. Replace shows how the Interpreter pattern can be used for more
	// than just evaluating expressions. In this case, it manipulates the
	// expression itself.
	// Replace can be viewed as an interpreter as well. It's an interpreter
	// whose context is the name of the variable being replaced along with the
	// expression that replaces it, and whose result is a new expression.
	// Even Copy can be thought of as an interpreter with an empty context.
	public BooleanExpression replace(String name, BooleanExpression booleanExp);
	public BooleanExpression copy();
}
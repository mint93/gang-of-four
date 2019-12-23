package com.designPatterns.gangOfFour.behavioral.interpreter;

public class Client {

	public static void main(String[] args) {
		BooleanExpression expression;
		Context context = new Context();
		VariableExpression x = new VariableExpression("X");
		VariableExpression y = new VariableExpression("Y");
		expression = new OrExpression(new AndExpression(new Constant(true), x),
									  new AndExpression(y, new NotExpression(x)));
		context.assign(x, false);
		context.assign(y, true);
		boolean result = expression.evaluate(context);
		System.out.println("(true and X) or (Y and (not X))");
		System.out.println(x.getName() + " = " + context.lookup(x.getName()));
		System.out.println(y.getName() + " = " + context.lookup(y.getName()));
		System.out.println("Result: " + result);
		
		VariableExpression z = new VariableExpression("Z");
		NotExpression notZ = new NotExpression(z);
		BooleanExpression replacement = expression.replace("Y", notZ);
		context.assign(z, true);
		result = replacement.evaluate(context);
		System.out.println("\n(true and X) or ((not Z) and (not X))");
		System.out.println(x.getName() + " = " + context.lookup(x.getName()));
		System.out.println(z.getName() + " = " + context.lookup(z.getName()));
		System.out.println("Result: " + result);
	}
	
}

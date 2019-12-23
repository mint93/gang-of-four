package com.designPatterns.gangOfFour.structual.facade;

public abstract class CodeGenerator {
	
	protected CodeGenerator(BytecodeStream bytecodeStream) {
		this.output = bytecodeStream;
	}
	
	protected BytecodeStream output;
	
	public abstract void visit(StatementNode statementNode);
	public abstract void visit(ExpressionNode expressionNode);
	
}
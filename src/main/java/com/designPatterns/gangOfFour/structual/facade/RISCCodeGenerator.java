package com.designPatterns.gangOfFour.structual.facade;

public class RISCCodeGenerator extends CodeGenerator {

	protected RISCCodeGenerator(BytecodeStream bytecodeStream) {
		super(bytecodeStream);
	}

	@Override
	public void visit(StatementNode statementNode) {
		System.out.println("RISCCodeGenerator::visit(StatementNode)");		
	}

	@Override
	public void visit(ExpressionNode expressionNode) {
		System.out.println("RISCCodeGenerator::visit(ExpressionNode)");
	}

}

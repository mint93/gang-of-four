package com.designPatterns.gangOfFour.structual.facade;

public class StackMachineCodeGenerator extends CodeGenerator {

	protected StackMachineCodeGenerator(BytecodeStream bytecodeStream) {
		super(bytecodeStream);
	}

	@Override
	public void visit(StatementNode statementNode) {
		System.out.println("StackMachineCodeGenerator::visit(StatementNode)");
	}

	@Override
	public void visit(ExpressionNode expressionNode) {
		System.out.println("StackMachineCodeGenerator::visit(ExpressionNode)");
	}

}

package com.designPatterns.gangOfFour.structual.facade;

public class StatementNode extends ProgramNode {

	@Override
	public void getSourcePosition(int line, int index) {
		System.out.println("StatementNode::getSourcePosition");
	}

	@Override
	public void traverse(CodeGenerator codeGenerator) {
		codeGenerator.visit(this);
		System.out.println("StatementNode::traverse");
	}

}

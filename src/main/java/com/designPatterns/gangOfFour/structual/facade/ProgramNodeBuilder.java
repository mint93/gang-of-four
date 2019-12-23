package com.designPatterns.gangOfFour.structual.facade;

public class ProgramNodeBuilder {
	
	private	ProgramNode node;
	
	public ProgramNodeBuilder(ProgramNode node) {
		this.node = node;
	}
	public ProgramNode newVariable(String variableName) {
		return new ExpressionNode();
	}
	public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
		return new ExpressionNode();
	}
	public ProgramNode newReturnStatement(ProgramNode value) {
		return new ExpressionNode();
	}
	public ProgramNode newCondition(ProgramNode condition,	ProgramNode truePart, ProgramNode falsePart) {
		return new ExpressionNode();
	}
	
	public ProgramNode getRootNode() {
		return node;
	}
	
}
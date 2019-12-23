package com.designPatterns.gangOfFour.structual.facade;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNode extends ProgramNode {
	
	protected List<ProgramNode> children = new ArrayList<>();
	
	@Override
	public void traverse(CodeGenerator codeGenerator) {
		codeGenerator.visit(this);
		for (ProgramNode programNode : children) {
			programNode.traverse(codeGenerator);
		}
	}

	@Override
	public void getSourcePosition(int line, int index) {
		System.out.println("ExpressionNode::getSourcePosition");
	}

	@Override
	public void add(ProgramNode programNode) {
		children.add(programNode);
	}

	@Override
	public void remove(ProgramNode programNode) {
		children.remove(programNode);
	}
}

package com.designPatterns.gangOfFour.structual.facade;

public abstract class ProgramNode {
	// program node manipulation
	public abstract void getSourcePosition(int line, int index);
	
	// child manipulation
	public void add(ProgramNode programNode) {
		throw new UnsupportedOperationException();
	}
	public void remove(ProgramNode programNode) {
		throw new UnsupportedOperationException();
	}
	
	public abstract void traverse(CodeGenerator codeGenerator);
	
}
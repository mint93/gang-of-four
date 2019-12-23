package com.designPatterns.gangOfFour.structual.facade;

public class Client {

	public static void main(String[] args) {
		Compiler compiler = new Compiler();
		compiler.compile(new InputStream(), new BytecodeStream());
	}
}

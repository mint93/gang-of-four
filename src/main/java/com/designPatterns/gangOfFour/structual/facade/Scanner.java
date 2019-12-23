package com.designPatterns.gangOfFour.structual.facade;

public class Scanner {
	
	private InputStream inputStream;
	
	public Scanner() {}
	
	public Scanner(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	public Token scan() {
		return new Token();
	}
	
}
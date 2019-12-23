package com.designPatterns.gangOfFour.behavioral.command.util;

public class Document {

	private String name;

	public Document(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println("Opening document named " + name);
	}

	public void paste() {
		System.out.println("Pasting document named " + name);
	}
	
}

package com.designPatterns.gangOfFour.structual.proxy;

public class Client {
	
	public static void main(String[] args) {
		TextDocument text = new TextDocument();
		text.insert(new ImageProxy("anImageFileName"));
		text.draw();
	}
	
}

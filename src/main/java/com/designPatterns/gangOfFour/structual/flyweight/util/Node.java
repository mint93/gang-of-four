package com.designPatterns.gangOfFour.structual.flyweight.util;

public class Node {
	
	private int length;
	private Font font;
	
	public Node(int length, Font font) {
		this.length = length;
		this.font = font;
	}
	
	public int getLength() {
		return length;
	}
	public Font getFont() {
		return font;
	}
	
}

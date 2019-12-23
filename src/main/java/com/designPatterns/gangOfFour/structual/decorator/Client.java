package com.designPatterns.gangOfFour.structual.decorator;

public class Client {
	public static void main(String[] args) {
		VisualComponent decoratedTextView = 
				new BorderDecorator(
						new ScrollDecorator(new TextView()),
						1
				);
		decoratedTextView.draw();
		decoratedTextView.resize();
	}
	
}

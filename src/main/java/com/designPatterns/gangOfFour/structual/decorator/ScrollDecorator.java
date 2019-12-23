package com.designPatterns.gangOfFour.structual.decorator;

// Concrete decorator
public class ScrollDecorator extends Decorator {

	public ScrollDecorator(VisualComponent visualComponent) {
		super(visualComponent);
	}
	@Override
	public void draw() {
		super.draw();
		addScrollBar();
	}
	
	private void addScrollBar() {
		System.out.println("Adding scroll bar.");
	}

}
package com.designPatterns.gangOfFour.structual.decorator;

// Concrete decorator
public class BorderDecorator extends Decorator {
	private	int width;

	public BorderDecorator(VisualComponent visualComponent, int borderWidth) {
		super(visualComponent);
		this.width = borderWidth;
	}
	@Override
	public void draw() {
		super.draw();
		drawBorder(width);
	}
	
	private void drawBorder(int width) {
		System.out.println("Drawing border.");
	}

}
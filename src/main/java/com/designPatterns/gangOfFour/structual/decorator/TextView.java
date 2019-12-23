package com.designPatterns.gangOfFour.structual.decorator;

// ConcreteComponent - defines an object to which additional
// responsibilities can be attached.
public class TextView implements VisualComponent {

	@Override
	public void draw() {
		System.out.println("Draw standard TextView.");
	}

	@Override
	public void resize() {
		System.out.println("Resize standard TextView.");
	}

}

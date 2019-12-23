package com.designPatterns.gangOfFour.structual.decorator;

// Decorator simply forwards draw requests to its component,
// and Decorator subclasses can extend this operation.

// There's no need to define an abstract Decorator class when you
// only need to add one responsibility. That's often the case when
// you're dealing with an existing class hierarchy rather than
// designing a new one.
public abstract class Decorator implements VisualComponent {
	private	VisualComponent visualComponent;
	
	public Decorator(VisualComponent visualComponent) {
		this.visualComponent = visualComponent;
	}
	@Override
	public void draw() {
		visualComponent.draw();
	}
	@Override
	public void resize() {
		visualComponent.resize();
	}

};
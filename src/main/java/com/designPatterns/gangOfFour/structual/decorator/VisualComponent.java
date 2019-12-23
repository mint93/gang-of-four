package com.designPatterns.gangOfFour.structual.decorator;

// Component - interface for objects that can have responsibilities
// added to them dynamically.

// Component have to be lightweight - it should focus on defining an
// interface, not on storing data. Otherwise the complexity of the
// Component class might make the decorators too heavyweight to use
// in quantity
// Strategies are a better choice in situations where the Component
// class is intrinsically heavyweight,
public interface VisualComponent {
	public void draw();
	public void resize();
}
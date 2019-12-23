package com.designPatterns.gangOfFour.structual.bridge;

import java.awt.Point;

// Implementor - defines the interface for implementation classes.
// This interface doesn't have to correspond exactly to Abstraction's
// interface; in fact the two interfaces can be quite different. 
// Typically the Implementor interface provides only primitive
// operations, and Abstraction defines higher-level operations
// based on these primitives.

// In situations where there's only one implementation,
// creating an abstract Implementor class isn't necessary.
public abstract class WindowImplementor {
	
	public abstract void impTop();
	public abstract void impBottom();
	public abstract void impSetExtent(Point p);
	public abstract void impSetOrigin(Point p);
	
	public abstract void deviceRect(int x0, int y0, int x1, int y1);
	public abstract void deviceText(String text, int x, int y);
	public abstract void deviceBitmap(String bitmapName, int x, int y);
	// lots of more functions for drawing on windows...
}

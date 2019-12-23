package com.designPatterns.gangOfFour.structual.bridge;

import java.awt.Point;

import com.designPatterns.gangOfFour.structual.bridge.util.View;

// Abstraction - defines the abstraction's interface,
// maintains a reference to an object of type Implementor.
public abstract class Window {
	
	private	WindowImplementor windowImp;
	private View contents; // the window's contents
	
	public Window(View contents) {
		this.contents = contents;
		// If Abstraction knows about all Concretelmplementor classes
		// then it can instantiate one of them in its constructor;
		// it can decide between them based on parameters passed to
		// its constructor.
		// Another approach is to choose a default implementation
		// initially and change it later according to usage.
		// It's also possible to delegate the decision to another
		// object altogether (like in this case).
	}
	
	// requests handled by window
	public abstract void drawContents();
	public abstract void open();
	public abstract void close();
	public abstract void iconify();
	public abstract void deiconify();
	
	// requests forwarded to implementation
	public void setOrigin(Point at) {
		getWindowImp().impSetOrigin(at);
	}
	public void setExtent(Point extent) {
		getWindowImp().impSetExtent(extent);
	}
	public void raise() {
		getWindowImp().impTop();
	}
	public void lower() {
		getWindowImp().impBottom();
	}
	public void drawRect(Point p1, Point p2) {
		getWindowImp().deviceRect(p1.x, p1.y, p2.x, p2.y);
	}
	public void drawText(String text, Point p) {
		getWindowImp().deviceText(text, p.x, p.y);
	}
	
	
	protected WindowImplementor getWindowImp() {
		if (windowImp == null) {
			windowImp = WindowSystemFactorySingleton.getInstance().createWindowImp();
		}
		return windowImp;
	}
	protected View getView() {
		return contents;
	}
	
}

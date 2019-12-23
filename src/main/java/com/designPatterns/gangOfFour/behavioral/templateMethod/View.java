package com.designPatterns.gangOfFour.behavioral.templateMethod;

// AbstractClass - defines abstract primitive operations that concrete
// subclasses define to implement steps of an algorithm.
// It implements a template method defining the skeleton of an algorithm.
// The template method calls primitive operations as well as operations
// defined in AbstractClass or those of other objects.
public abstract class View {

	// A template method defines an algorithm in terms of abstract
	// operations that subclasses override to provide concrete behavior.
	// By defining some of the steps of an algorithm using abstract
	// operations, the template method fixes their ordering, but it lets
	// its subclasses vary those steps to suit their needs.
	// The template method itself should not be overridden
	public final void display () {
		setFocus();
		doDisplay();
		resetFocus();
	}

	protected void resetFocus() {
		System.out.println("Reseting focus");
	}

	// Naming conventions. You can identify the operations that should be
	// overridden by adding a prefix to their names. For example, the MacApp
	// framework for Macintosh applications prefixes template methods with "Do-".
	protected abstract void doDisplay();

	protected void setFocus() {
		System.out.println("Setting focus");
	}
	
}

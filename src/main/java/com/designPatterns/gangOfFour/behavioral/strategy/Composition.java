package com.designPatterns.gangOfFour.behavioral.strategy;

import com.designPatterns.gangOfFour.behavioral.strategy.util.Coord;

// Context
// Strategy and Context interact to implement the chosen algorithm.
// A context may pass all data required by the algorithm to the
// strategy when the algorithm is called. Alternatively, the context
// can pass itself as an argument to Strategy operations.
// But now Context must define a more elaborate interface to its
// data, which couples Strategy and Context more closely.
public class Composition {
	private Compositor compositor;
	private int componentCount; // the number of components
	private int lineWidth;	// the Composition's line width
	private int lineBreaks; // the position of linebreaks
	private int lineCount; // the number of lines
	
	// Clients usually create and pass a ConcreteStrategy object
	// to the context.
	// An algorithm uses data that clients shouldn't know about.
	// Use the Strategy pattern to avoid exposing complex,
	// algorithm-specific data structures.
	public Composition(Compositor compositor) {
		this.compositor = compositor;
	}
	
	public void repair() {
		Coord natural[] = null;
		Coord stretchability[] = null;
		Coord shrinkability[] = null;
		int componentCount = 0;
		int breaks[] = null;
		// prepare the arrays with the desired component sizes
		// . . .
		
		// determine where the breaks are:
		int breakCount = compositor.compose(
		natural, stretchability, shrinkability,
		componentCount, lineWidth, breaks);
		// lay out components according to breaks
		// . .
	}
}

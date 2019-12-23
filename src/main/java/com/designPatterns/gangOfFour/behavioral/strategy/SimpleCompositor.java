package com.designPatterns.gangOfFour.behavioral.strategy;

import com.designPatterns.gangOfFour.behavioral.strategy.util.Coord;

// Concrete strategy
public class SimpleCompositor implements Compositor {
	@Override
	public int compose(Coord natural[], Coord stretch[], Coord shrink[],
			int componentCount, int lineWidth, int breaks[]) {
		// SimpleCompositor ignores the stretchability of the 
		// components, taking only their natural widths into account.
		System.out.println("SimpleCompositor is calculating the linebreaks");
		return 0;
	}
}

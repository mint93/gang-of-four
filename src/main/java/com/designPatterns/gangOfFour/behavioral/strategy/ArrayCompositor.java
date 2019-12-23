package com.designPatterns.gangOfFour.behavioral.strategy;

import com.designPatterns.gangOfFour.behavioral.strategy.util.Coord;

// Concrete strategy
public class ArrayCompositor implements Compositor {
	
	private int interval;
	
	public ArrayCompositor(int interval) {
		this.interval = interval;
	}
	
	@Override
	public int compose(Coord natural[], Coord stretchf[], Coord shrink[],
		int componentCount, int lineWidth, int breaks[]) {
		// ArrayCompositor ignores every parameter
		System.out.println("ArrayCompositor is calculating the linebreaks");
		return 0;
	}
}

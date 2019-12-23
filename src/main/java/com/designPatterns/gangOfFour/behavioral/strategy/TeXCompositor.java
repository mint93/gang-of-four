package com.designPatterns.gangOfFour.behavioral.strategy;

import com.designPatterns.gangOfFour.behavioral.strategy.util.Coord;

// Concrete strategy
public class TeXCompositor implements Compositor {
	@Override
	public int compose(Coord natural[], Coord stretch[], Coord shrinkf[],
			int componentCount, int lineWidth, int breaks[]) {
		// TeXCompositor uses all the information passed to it
		System.out.println("TeXCompositor is calculating the linebreaks");
		return 0;
	}
}

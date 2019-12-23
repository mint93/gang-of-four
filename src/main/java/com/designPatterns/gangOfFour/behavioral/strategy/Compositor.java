package com.designPatterns.gangOfFour.behavioral.strategy;

import com.designPatterns.gangOfFour.behavioral.strategy.util.Coord;

// Strategy - declares an interface common to all supported algorithms
public interface Compositor {

	// The Strategy interface is shared by all ConcreteStrategy
	// classes whether the algorithms they implement are trivial
	// or complex. Hence it's likely that some ConcreteStrategies
	// won't use all the information passed to them.
	public int compose(Coord natural[], Coord stretch[], Coord shrinkf[], 
			int componentCount, int lineWidth, int breaks[]);

}
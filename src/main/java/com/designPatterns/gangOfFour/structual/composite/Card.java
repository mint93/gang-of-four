package com.designPatterns.gangOfFour.structual.composite;

// Leaf object - represents leaf objects in the composition.
// A leaf has no children. Defines behavior for primitive
// objects in the composition.
public class Card extends Equipment {
	
	private int netPrice;
	private int powerConsumption;

	public Card(String name, int netPrice, int powerConsumption) {
		super(name);
		this.netPrice = netPrice;
		this.powerConsumption = powerConsumption;
	}

	@Override
	public int powerConsumption() {
		return powerConsumption;
	}

	@Override
	public int netPrice() {
		return netPrice;
	}

}

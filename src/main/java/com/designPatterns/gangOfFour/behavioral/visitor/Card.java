package com.designPatterns.gangOfFour.behavioral.visitor;

public class Card extends Equipment {
	
	private int netPrice;
	private int discountPrice;
	private int powerConsumption;

	public Card(String name, int netPrice, int discountPrice, int powerConsumption) {
		super(name);
		this.netPrice = netPrice;
		this.discountPrice = discountPrice;
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

	@Override
	public void accept(EquipmentVisitor visitor) {
		visitor.visitCard(this);
	}

	@Override
	public int discountPrice() {
		return discountPrice;
	}

}

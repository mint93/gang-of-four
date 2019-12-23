package com.designPatterns.gangOfFour.behavioral.visitor;

public class FloppyDisk extends Equipment {
	
	private int netPrice;
	private int discountPrice;
	private int powerConsumption;

	public FloppyDisk(String name, int netPrice, int discountPrice, int powerConsumtion) {
		super(name);
		this.netPrice = netPrice;
		this.discountPrice = discountPrice;
		this.powerConsumption = powerConsumtion;
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
		visitor.visitFloppyDisk(this);
	}

	@Override
	public int discountPrice() {
		return discountPrice;
	}

}

package com.designPatterns.gangOfFour.behavioral.visitor;

public class PricingVisitor implements EquipmentVisitor {
	
	private int totalPrice = 0;
	
	public int getTotalPrice() {
		return totalPrice;
	}
	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		totalPrice += floppyDisk.netPrice();
	}
	@Override
	public void visitCard(Card card) {
		totalPrice += card.netPrice();
	}
	@Override
	public void visitChassis(Chassis chassis) {
		totalPrice += chassis.discountPrice();
	}
	@Override
	public void visitBus(Bus bus) {
		totalPrice += bus.discountPrice();
	}
	
}
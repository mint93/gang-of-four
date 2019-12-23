package com.designPatterns.gangOfFour.behavioral.visitor;

public class Chassis extends CompositeEquipment {

	public Chassis(String name) {
		super(name);
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		iterator().forEachRemaining(equipment -> equipment.accept(visitor));
		visitor.visitChassis(this);
	}
	
};

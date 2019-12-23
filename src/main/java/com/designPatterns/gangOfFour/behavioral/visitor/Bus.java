package com.designPatterns.gangOfFour.behavioral.visitor;

public class Bus extends CompositeEquipment {

	public Bus(String name) {
		super(name);
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		iterator().forEachRemaining(equipment -> equipment.accept(visitor));
		visitor.visitBus(this);
	}
	
};

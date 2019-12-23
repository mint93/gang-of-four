package com.designPatterns.gangOfFour.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class InventoryVisitor implements EquipmentVisitor {
	
	private List<Equipment> inventory = new ArrayList<>();

	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		inventory.add(floppyDisk);
	}

	@Override
	public void visitCard(Card card) {
		inventory.add(card);
	}

	@Override
	public void visitChassis(Chassis chassis) {
		inventory.add(chassis);
	}

	@Override
	public void visitBus(Bus bus) {
		inventory.add(bus);
	}

	public List<Equipment> getInventory() {
		return inventory;
	}
	
}
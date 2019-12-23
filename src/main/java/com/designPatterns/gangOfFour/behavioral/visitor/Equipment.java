package com.designPatterns.gangOfFour.behavioral.visitor;

import java.util.Iterator;

public abstract class Equipment implements Iterable<Equipment> {

	private String name;
	
	public Equipment(String name) {
	this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract int powerConsumption();
	public abstract int netPrice();
	public abstract int discountPrice();
	
	public abstract void accept(EquipmentVisitor visitor);

	public void add(Equipment equipment) {
		throw new UnsupportedOperationException();
	}
	public void remove(Equipment equipment) {
		throw new UnsupportedOperationException();
	}
	public Iterator<Equipment> iterator() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		return "Equipment [name=" + name + "]";
	}
	
}

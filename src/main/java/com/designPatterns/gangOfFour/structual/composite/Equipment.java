package com.designPatterns.gangOfFour.structual.composite;

import java.util.Iterator;

// Component - implements default behavior for the interface
// common to all classes
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

	// Usually it's better to make Add and Remove fail by default
	// (perhaps by raising an exception) if the component
	// isn't allowed to have children or if	the argument of
	// remove isn't a child of the component, respectively.
	public void add(Equipment equipment) {
		throw new UnsupportedOperationException();
	}
	public void remove(Equipment equipment) {
		throw new UnsupportedOperationException();
	}
	// Equipment may also returns an Iterator for accessing its parts.
	public Iterator<Equipment> iterator() {
		throw new UnsupportedOperationException();
	}
}

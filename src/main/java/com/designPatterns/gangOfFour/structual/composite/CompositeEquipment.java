package com.designPatterns.gangOfFour.structual.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// CompositeEquipment is the base class for equipment that
// contains other equipment.
public abstract class CompositeEquipment extends Equipment {
	
	private List<Equipment> equipmentList = new ArrayList<>();
	
	public CompositeEquipment(String name) {
		super(name);
	}
	
	@Override
	public void add(Equipment equipment) {
		equipmentList.add(equipment);
	}
	@Override
	public void remove(Equipment equipment) {
		equipmentList.remove(equipment);
	}
	
	// CompositeEquipment may have a default implementation
	// of Component methods
	@Override
	public int powerConsumption( ) {
		return equipmentList.stream()
				.mapToInt(Equipment::powerConsumption)
				.sum();
	}
	@Override
	public int netPrice () {
		return equipmentList.stream()
				.mapToInt(Equipment::netPrice)
				.sum();
	}

	@Override
	public Iterator<Equipment> iterator() {
		return new CompositeEquipmentIterator();
	}
	
	private class CompositeEquipmentIterator implements Iterator<Equipment> {
		int size = equipmentList.size();
		int currentPointer = 0;

		public boolean hasNext() {
			return (currentPointer < size);
		}

		public Equipment next() {
			if (!hasNext()) {
                throw new NoSuchElementException();
            }
			return equipmentList.get(currentPointer++);
		}
	}

}
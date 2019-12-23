package com.designPatterns.gangOfFour.creational.util;

public class EnchantedRoom extends Room {
	private Spell spell;
	
	public EnchantedRoom(int roomNumber, Spell spell) {
		super(roomNumber);
		this.spell = spell;
		System.out.println("Creating EnchantedRoom with number " + roomNumber);
	}
	public EnchantedRoom(EnchantedRoom other) {
		super(other.getRoomNumber());
		this.spell = other.spell;
	}
	@Override
	public Room clone() {
		return new EnchantedRoom(this);
	}

}

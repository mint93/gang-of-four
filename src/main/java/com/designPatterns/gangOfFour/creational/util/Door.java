package com.designPatterns.gangOfFour.creational.util;

public class Door implements MapSite {
	private Room room1;
	private Room room2;
	private boolean isOpen = false;
	
	public Door(Room room1, Room room2) {
		System.out.println("Creating Door");
		this.room1 = room1;
		this.room2 = room2;
	}
	
	public Door(Door other) {
		this.room1 = other.room1;
		this.room2 = other.room2;
	}
	public void initialize(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
	}
	@Override
	public Door clone() {
		return new Door(this);
	}

	public Room otherSideFrom(Room room) {
		if (room.getRoomNumber() ==  room1.getRoomNumber()) {
			return room2;
		} else if (room.getRoomNumber() == room2.getRoomNumber()) {
			return room1;
		} else {
			return null;
		}
	}
	
	@Override
	public void enter() {
		if (isOpen) {
			System.out.println("Entering a door");
		} else {
			System.out.println("Door is locked");
		}
	}   
}
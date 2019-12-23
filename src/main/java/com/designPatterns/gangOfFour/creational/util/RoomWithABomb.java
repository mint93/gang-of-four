package com.designPatterns.gangOfFour.creational.util;

public class RoomWithABomb extends Room {

	private boolean hasBomb;
	
	public RoomWithABomb(int roomNumber) {
		super(roomNumber);
		System.out.println("Creating RoomWithABomb with number " + roomNumber);
	}
	public RoomWithABomb(RoomWithABomb other) {
		super(other.getRoomNumber());
		this.hasBomb = other.hasBomb;
	}
	@Override
	public Room clone() {
		return new RoomWithABomb(this);
	}

	public boolean hasBomb() {
		return hasBomb;
	}

	public void setHasBomb(boolean hasBomb) {
		this.hasBomb = hasBomb;
	}

};

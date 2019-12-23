package com.designPatterns.gangOfFour.creational.util;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {
	private Map<Direction, MapSite> roomSides = new HashMap<>();
	private int roomNumber;
	
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println("Creating Room with number " + roomNumber);
	}

    public void setSide(Direction direction, MapSite side) {
    	roomSides.put(direction, side);
    }
    public MapSite getSide(Direction direction) {
    	return roomSides.get(direction);
    }
    
    public int getRoomNumber() {
    	return roomNumber;
    }

	@Override
	public void enter() {
		System.out.println("Entering a room nr " + roomNumber);
	}

	@Override
	public Room clone() {
		Room room = new Room(roomNumber);
		room.roomSides.putAll(roomSides);
		return room;
	}
	
	
}
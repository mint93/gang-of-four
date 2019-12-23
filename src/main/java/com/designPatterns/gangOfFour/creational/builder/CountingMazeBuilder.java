package com.designPatterns.gangOfFour.creational.builder;

import com.designPatterns.gangOfFour.creational.util.Room;

// CountingMazeBuilder doesn't create a maze at all; it just counts the
// different kinds of components that would have been created.
public class CountingMazeBuilder extends MazeBuilder {
	
	private int doors;
	private	int rooms;
	
	public CountingMazeBuilder () {
		this.rooms = 0;
		this.doors = 0;
	}

	@Override
	public Room buildRoom(int roomNumber) {
		rooms++;
		return null;
	}

	@Override
	public void buildDoor(Room roomFrom, Room roomTo) {
		doors++;
	}

	public int getDoorsCount() {
		return doors;
	}

	public int getRoomsCount() {
		return rooms;
	}
	
}
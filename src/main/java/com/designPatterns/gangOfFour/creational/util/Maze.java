package com.designPatterns.gangOfFour.creational.util;

import java.util.ArrayList;
import java.util.List;

public class Maze {

	private List<Room> rooms = new ArrayList<>(); 

	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	public Room getRoom(int roomNumber) {
		return rooms.stream()
			.filter(room -> room.getRoomNumber() == roomNumber)
			.findFirst()
			.orElse(null);
	}

	@Override
	public Maze clone() {
		Maze maze = new Maze();
		this.rooms.forEach(room -> {
			maze.addRoom(room.clone());
		});
		return maze;
	}
	
	

}

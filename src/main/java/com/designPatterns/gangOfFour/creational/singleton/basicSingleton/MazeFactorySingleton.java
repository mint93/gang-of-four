package com.designPatterns.gangOfFour.creational.singleton.basicSingleton;

import com.designPatterns.gangOfFour.creational.util.Door;
import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.Wall;

public class MazeFactorySingleton {
	
	private static MazeFactorySingleton instance;
	
	protected MazeFactorySingleton() {
		System.out.println("Creating MazeFactory");
	}
	
	public static MazeFactorySingleton instance() {
		if (instance == null) {
			instance = new MazeFactorySingleton();
		}
		return instance;
	}

	public Maze makeMaze() {
		return new Maze();
	}
	public Wall makeWall() {
		return new Wall();
	}
	public Room makeRoom(int roomNumber) {
		return new Room(roomNumber);
	}
	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}
}
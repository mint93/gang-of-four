package com.designPatterns.gangOfFour.creational.abstractFactory;

import com.designPatterns.gangOfFour.creational.util.Door;
import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.Wall;

// MazeFactory is not an abstract class; thus it acts as both
// the AbstractFactory and the ConcreteFactory.
// Because the MazeFactory is a concrete class consisting entirely
// of factory methods, it's easy to make a new MazeFactory by making
// a subclass and overriding the operations that need to change.
public class MazeFactory {

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
package com.designPatterns.gangOfFour.creational.builder;

import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.Room;

// Builder - specifies an abstract interface for creating parts of a Product object.

// Typically there's an abstract Builder class that defines an operation for
// each component that a director may ask it to create. The operations do
// nothing by default (they're defined as empty method). A ConcreteBuilder
// class overrides operations for components it's interested in creating.
public abstract class MazeBuilder {
	public void buildMaze() { }
	public Room buildRoom(int roomNumber) {
		return null;
	}
	public void buildDoor(Room roomFrom, Room roomTo) { }
	
	public Maze getMaze() { return null; }
}
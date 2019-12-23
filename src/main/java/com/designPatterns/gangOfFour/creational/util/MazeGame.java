package com.designPatterns.gangOfFour.creational.util;

import com.designPatterns.gangOfFour.creational.abstractFactory.MazeFactory;
import com.designPatterns.gangOfFour.creational.builder.MazeBuilder;

public class MazeGame {
	
	// The real problem with this member function is its inflexibility.
	// It hard-codes the maze layout. Changing the layout means changing this
	// member function, either by overriding it—which means reimplementing the
	// whole thing—or by changing parts of it—which is error-prone and doesn't
	// promote reuse. The biggest barrier to change lies in hard-coding the
	// classes that get instantiated.
	public Maze createMaze () {
		Maze maze = new Maze();
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Door door = new Door(room1, room2);
		maze.addRoom(room1);
		maze.addRoom(room2);
		room1.setSide(Direction.NORTH, new Wall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, new Wall());
		room1.setSide(Direction.WEST, new Wall());
		room2.setSide(Direction.NORTH, new Wall());
		room2.setSide(Direction.EAST, new Wall());
		room2.setSide(Direction.SOUTH, new Wall());
		room2.setSide(Direction.WEST, door);	
		return maze;
	}
	
	// Abstract Factory
	public Maze createMaze (MazeFactory factory) {
		Maze maze = factory.makeMaze();
		Room room1 = factory.makeRoom(1);
		Room room2 = factory.makeRoom(2);
		Door door = factory.makeDoor(room1, room2);
		maze.addRoom(room1);
		maze.addRoom(room2);
		room1.setSide(Direction.NORTH, factory.makeWall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, factory.makeWall());
		room1.setSide(Direction.WEST, factory.makeWall());
		room2.setSide(Direction.NORTH, factory.makeWall());
		room2.setSide(Direction.EAST, factory.makeWall());
		room2.setSide(Direction.SOUTH, factory.makeWall());
		room2.setSide(Direction.WEST, door);	
		return maze;
	}
	
	// Notice how the builder hides the internal representation of the
	// Maze—that is, the classes that define rooms, doors, and walls—and
	// how these parts are assembled to complete the final maze. Someone
	// might guess that there are classes for representing rooms and doors,
	// but there is no hint of one for walls.
	public Maze createMaze (MazeBuilder builder) {
		builder.buildMaze();
		// Sometimes you might need access to parts of the product
		// constructed earlier. In that case, the builder would return
		// child nodes to the director, which then would pass them back
		// to the builder to build the parent nodes.
		Room room1 = builder.buildRoom(1);
		Room room2 = builder.buildRoom(2);
		setCommonSide(room1, Direction.EAST, room2, Direction.WEST);
		builder.buildDoor(room1, room2);
		return builder.getMaze();
	}
	private void setCommonSide(Room room1, Direction room1Direction, Room room2, Direction room2Direction) {
		if (room1 != null && room2 != null) {
			room1.setSide(room1Direction, room2.getSide(room2Direction));
		}
	}
	
	public Maze createComplexMaze(MazeBuilder builder) {
		builder.buildRoom(1);
		// . . .
		builder.buildRoom(1001);
		return builder.getMaze();
	}
	
	// factory methods
	// Each factory method returns a maze component of a given type.
	// MazeGame provides default implementations that return the simplest
	// kinds of maze, rooms, walls, and doors.
	public Maze makeMaze() {
		return new Maze();
	}
	public Room makeRoom(int roomNumber) {
		return new Room(roomNumber);
	}
	public Wall makeWall() {
		return new Wall();
	}
	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}
	
	public Maze createMazeWithFactoryMethod() {
		Maze maze = makeMaze ();
		Room room1 = makeRoom(1);
		Room room2 = makeRoom(2);
		Door theDoor = makeDoor(room1, room2);
		maze.addRoom(room1);
		maze.addRoom(room2);
		room1.setSide(Direction.NORTH, makeWall());
		room1.setSide(Direction.EAST, theDoor);
		room1.setSide(Direction.SOUTH, makeWall());
		room1.setSide(Direction.WEST, makeWall());
		room2.setSide(Direction.NORTH, makeWall());
		room2.setSide(Direction.EAST, makeWall());
		room2.setSide(Direction.SOUTH, makeWall());
		room2.setSide(Direction.WEST, theDoor);
		return maze;
	}
}

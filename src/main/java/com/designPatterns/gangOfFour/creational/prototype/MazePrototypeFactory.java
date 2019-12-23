package com.designPatterns.gangOfFour.creational.prototype;

import com.designPatterns.gangOfFour.creational.abstractFactory.MazeFactory;
import com.designPatterns.gangOfFour.creational.util.Door;
import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.Wall;

// MazePrototypeFactory will be initialized with prototypes of the objects
// it will create so that we don't have to subclass it just to change the
// classes of walls or rooms it creates.
public class MazePrototypeFactory extends MazeFactory {

	private Maze prototypeMaze;
	private Room prototypeRoom;
	private Wall prototypeWall;
	private Door prototypeDoor;
	
	// constructor takes the prototypes as arguments
	public MazePrototypeFactory(Maze maze, Room room, Wall wall, Door door) {
		this.prototypeMaze = maze;
		this.prototypeRoom = room;
		this.prototypeWall = wall;
		this.prototypeDoor = door;
	}
	
	@Override
	public Maze makeMaze() {
		return prototypeMaze.clone();
	}

	@Override
	public Wall makeWall() {
		return prototypeWall.clone();
	}

	@Override
	public Room makeRoom(int roomNumber) {
		return prototypeRoom.clone();
	}

	@Override
	public Door makeDoor(Room room1, Room room2) {
		Door door = prototypeDoor.clone();
		// It might be the case that your prototype classes already define
		// operations for (re)setting key pieces of state. If so, clients
		// may use these operations immediately after cloning. If not, then
		// you may have to introduce an Initialize operation that takes
		// initialization parameters as arguments and sets the clone's
		// internal state accordingly.
		door.initialize(room1, room2);
		return door;
	}

}
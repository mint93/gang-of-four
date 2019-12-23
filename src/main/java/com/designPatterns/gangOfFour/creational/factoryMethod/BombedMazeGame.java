package com.designPatterns.gangOfFour.creational.factoryMethod;

import com.designPatterns.gangOfFour.creational.util.BombedWall;
import com.designPatterns.gangOfFour.creational.util.MazeGame;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.RoomWithABomb;
import com.designPatterns.gangOfFour.creational.util.Wall;

// Different games can subclass MazeGame to specialize parts of the maze.
// MazeGame subclasses can redefine some or all of the factory methods to
// specify variations in products. BombedMazeGame can redefine the Room
// and Wall products to return the bombed varieties.
public class BombedMazeGame extends MazeGame {
	@Override
	public Wall makeWall() {
		return new BombedWall();
	}
	@Override
	public Room makeRoom(int roomNumber) {
		return new RoomWithABomb(roomNumber);
	}
}
package com.designPatterns.gangOfFour.creational.abstractFactory;

import com.designPatterns.gangOfFour.creational.util.BombedWall;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.RoomWithABomb;
import com.designPatterns.gangOfFour.creational.util.Wall;

// BombedMazeFactory will override different member functions
// and return different subclasses of Room and Wall
public class BombedMazeFactory extends MazeFactory {
	@Override
	public Wall makeWall() {
		return new BombedWall();
	}
	@Override
	public Room makeRoom(int roomNumber) {
		return new RoomWithABomb(roomNumber);
	}
}

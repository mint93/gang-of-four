package com.designPatterns.gangOfFour.creational.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.designPatterns.gangOfFour.creational.util.Direction;
import com.designPatterns.gangOfFour.creational.util.Door;
import com.designPatterns.gangOfFour.creational.util.MapSite;
import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.Wall;

public class StandardMazeBuilder extends MazeBuilder {

	private	Maze currentMaze;
	
	public StandardMazeBuilder() {
		currentMaze = null;
	}
	
	@Override
	public void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	public Room buildRoom(int roomNumber) {
		if (currentMaze.getRoom(roomNumber) == null) {
			Room room = new Room(roomNumber);
			currentMaze.addRoom(room);
			room.setSide(Direction.NORTH, new Wall());
			room.setSide(Direction.SOUTH, new Wall());
			room.setSide(Direction.EAST, new Wall());
			room.setSide(Direction.WEST, new Wall());
			return room;
		}
		return null;
	}

	@Override
	public void buildDoor(Room roomFrom, Room roomTo) {
		Door door = new Door(roomFrom, roomTo);
		Direction commonWallForRoomFrom = commonWall(roomFrom,roomTo);
		Direction commonWallForRoomTo = commonWall(roomTo,roomFrom);
		roomFrom.setSide(commonWallForRoomFrom, door);
		roomTo.setSide(commonWallForRoomTo, door);
	}
	
	private Direction commonWall(Room room1, Room room2) {
		return Stream.of(Direction.values())
				.filter(direction -> getMapSites(room2).contains(room1.getSide(direction)))
				.findFirst()
				.orElse(null);
	}

	private List<MapSite> getMapSites(Room room) {
		return Stream.of(Direction.values())
			.map(direction -> room.getSide(direction))
			.collect(Collectors.toList());
	}

	@Override
	public Maze getMaze() {
		return currentMaze;
	}

}
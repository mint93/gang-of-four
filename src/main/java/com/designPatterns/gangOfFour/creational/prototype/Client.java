package com.designPatterns.gangOfFour.creational.prototype;

import com.designPatterns.gangOfFour.creational.abstractFactory.MazeFactory;
import com.designPatterns.gangOfFour.creational.util.BombedWall;
import com.designPatterns.gangOfFour.creational.util.Door;
import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.MazeGame;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.RoomWithABomb;
import com.designPatterns.gangOfFour.creational.util.Wall;

public class Client {
	public static void main(String[] args) {
		System.out.println("SimpleMazePrototypeFactory");
		MazeGame game = new MazeGame();
		MazeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Room(1), new Wall(), new Door(new Room(2), new Room(3)));
		Maze maze = game.createMaze(simpleMazeFactory);
		
		System.out.println("\nBombedMazePrototypeFactory");
		// To change the type of maze, we initialize MazePrototypeFactory
		// with a different set of prototypes. The following call creates
		// a maze with a BombedDoor and a RoomWithABomb:
		MazeFactory bombedMazeFactory = new MazePrototypeFactory(new Maze(), new RoomWithABomb(4), new BombedWall(), new Door(new Room(5), new Room(6)));
		Maze bombedMaze = game.createMaze(bombedMazeFactory);
	}
}

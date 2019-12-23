package com.designPatterns.gangOfFour.creational.builder;

import com.designPatterns.gangOfFour.creational.util.Maze;
import com.designPatterns.gangOfFour.creational.util.MazeGame;

public class Client {

	public static void main(String[] args) {
		System.out.println("StandardMazeBuilder");
		// The client creates the Director object and configures it with the
		// desired Builder object.
		MazeGame game = new MazeGame();
		StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();
		game.createMaze(standardMazeBuilder);
		// The client retrieves the product from the builder.
		Maze maze = standardMazeBuilder.getMaze();
		
		System.out.println("\nCountingMazeBuilder");
		CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
		game.createMaze(countingMazeBuilder);
		int roomsCount = countingMazeBuilder.getRoomsCount();
		int doorsCount = countingMazeBuilder.getDoorsCount();
		System.out.println("The maze has " + roomsCount + " rooms and " + doorsCount + " doors");
	}
}

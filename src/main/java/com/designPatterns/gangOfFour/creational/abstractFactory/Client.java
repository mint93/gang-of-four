package com.designPatterns.gangOfFour.creational.abstractFactory;

import com.designPatterns.gangOfFour.creational.util.MazeGame;

public class Client {

	public static void main(String[] args) {
		MazeGame mazeGame = new MazeGame();
		
		System.out.println("Creating Enchanted Maze");
		mazeGame.createMaze(new EnchantedMazeFactory());
		
		System.out.println("\nCreating Bombed Maze");
		mazeGame.createMaze(new BombedMazeFactory());
	}
	
}
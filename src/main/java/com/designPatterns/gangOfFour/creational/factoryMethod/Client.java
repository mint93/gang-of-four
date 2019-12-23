package com.designPatterns.gangOfFour.creational.factoryMethod;

import com.designPatterns.gangOfFour.creational.util.MazeGame;

public class Client {
	public static void main(String[] args) {
		System.out.println("Creating BombedMazeGame");
		MazeGame bombedMazeGame = new BombedMazeGame();
		bombedMazeGame.createMazeWithFactoryMethod();
	
		System.out.println("\nCreating EnchantedMazeGame");
		MazeGame enchantedMazeGame = new EnchantedMazeGame();
		enchantedMazeGame.createMazeWithFactoryMethod();
	}
}

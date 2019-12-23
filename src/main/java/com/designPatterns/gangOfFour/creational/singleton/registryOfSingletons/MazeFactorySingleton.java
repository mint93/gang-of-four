package com.designPatterns.gangOfFour.creational.singleton.registryOfSingletons;

public class MazeFactorySingleton extends Singleton {
	
	public static void register() {
		if(lookup("MazeFactorySingleton") == null) {
			register("MazeFactorySingleton", new MazeFactorySingleton());
		}
	}
	
	protected MazeFactorySingleton() {
		System.out.println("Creating MazeFactory");
	}
}
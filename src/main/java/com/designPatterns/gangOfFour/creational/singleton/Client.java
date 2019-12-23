package com.designPatterns.gangOfFour.creational.singleton;

import com.designPatterns.gangOfFour.creational.singleton.basicSingleton.MazeFactorySingleton;
import com.designPatterns.gangOfFour.creational.singleton.registryOfSingletons.Singleton;

public class Client {
	public static void main(String[] args) {
		System.out.println("Basic Singleton");
		MazeFactorySingleton.instance();
		MazeFactorySingleton.instance();
		
		System.out.println("\nRegistry of Singletons");
		com.designPatterns.gangOfFour.creational.singleton.registryOfSingletons.MazeFactorySingleton.register();
		com.designPatterns.gangOfFour.creational.singleton.registryOfSingletons.MazeFactorySingleton.register();
		Singleton mySingleton= com.designPatterns.gangOfFour.creational.singleton.registryOfSingletons.MazeFactorySingleton.instance();
	}
}

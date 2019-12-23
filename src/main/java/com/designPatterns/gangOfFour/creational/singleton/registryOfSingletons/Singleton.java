package com.designPatterns.gangOfFour.creational.singleton.registryOfSingletons;

import java.util.HashMap;
import java.util.Map;

public abstract class Singleton {
	private	static Singleton instance;
	private	static Map<String, Singleton> registry = new HashMap<>();
		
	public static void register(String name, Singleton singleton) {
	    registry.put(name, singleton);
	    instance = null;
	}
	public static Singleton instance() {
		// Let's consider what happens when there are subclasses of Singleton, and
		// the application must decide which one to use. We'll select the kind of
		// maze through an environment variable and add code that instantiates the
		// proper subclass based on the environment variable's value.
		// Note that Instance must be modified whenever you define a new subclass
		// of Singleton.
		if (instance == null) {
			// user or environment supplies this at startup
			String singletonName = System.getenv("SINGLETON");
			
			// Lookup returns null if there's no such singleton
			instance = lookup(singletonName);
		}
		return instance;
	}
	protected static Singleton lookup(String name) {
		return registry.get(name);
	}
	
}
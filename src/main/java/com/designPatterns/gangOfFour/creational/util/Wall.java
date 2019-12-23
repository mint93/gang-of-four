package com.designPatterns.gangOfFour.creational.util;

public class Wall implements MapSite {
	public Wall() {
		System.out.println("Creating Wall");
	}

	@Override
	public void enter() {
		System.out.println("Entering a wall");
	}

	@Override
	public Wall clone(){
		return new Wall();
	}
	
	
}
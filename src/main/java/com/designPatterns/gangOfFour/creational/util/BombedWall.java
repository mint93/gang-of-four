package com.designPatterns.gangOfFour.creational.util;

public class BombedWall extends Wall {
	
	private boolean hasBomb;
	
	public BombedWall() {
		System.out.println("Creating BombedWall");
	}
	
	public BombedWall(BombedWall other) {
		this.hasBomb = other.hasBomb;
	}
	// Although BombedWall's Clone returns a Wall, its implementation returns
	// a new instance of a subclass, that is, a BombedWa11. We define Clone
	// like this in the base class to ensure that clients that clone the
	// prototype don't have to know about their concrete subclasses. Clients
	// should never need to downcast the return value of Clone to the desired
	// type.
	@Override
	public Wall clone() {
		return new BombedWall(this);
	}
	
	public boolean hasBomb() {
		return hasBomb;
	}

	public void setHasBomb(boolean hasBomb) {
		this.hasBomb = hasBomb;
	}

};
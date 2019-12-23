package com.designPatterns.gangOfFour.structual.adapter.util;

public class Coord {

	private int xCoord, yCoord;
	
	public Coord() {
		this.xCoord = 0;
		this.yCoord = 0;
	}

	public Coord(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	public int getCoords() {
		return xCoord + yCoord;
	}

}

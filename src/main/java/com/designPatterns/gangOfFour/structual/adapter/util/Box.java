package com.designPatterns.gangOfFour.structual.adapter.util;

public class Box {
	private Point bottomLeft;
	private Point topRight;
	
	public Box(Point bottomLeft, Point topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}

	public Point getBottomLeft() {
		return bottomLeft;
	}

	public Point getTopRight() {
		return topRight;
	}

}

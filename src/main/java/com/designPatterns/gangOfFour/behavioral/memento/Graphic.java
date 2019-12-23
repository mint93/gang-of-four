package com.designPatterns.gangOfFour.behavioral.memento;

import com.designPatterns.gangOfFour.behavioral.memento.util.Point;

public class Graphic implements Cloneable {

	private Point currentPosition;
	
	public Graphic() {
		this.currentPosition = new Point(0, 0);
	}

	public void move(Point delta) {
		System.out.println("Moving graphic, position before: " + currentPosition);
		currentPosition.move(delta);
		System.out.println("Moving graphic, position after: " + currentPosition);
	}

	@Override
	public Graphic clone() {
		Graphic graphic = null;
		try {
			graphic = (Graphic) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		graphic.currentPosition = new Point(currentPosition.getX(), currentPosition.getY());
		return graphic;
	}

	@Override
	public String toString() {
		return "Graphic [currentPosition=" + currentPosition + "]";
	}
	
}

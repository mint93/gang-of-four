package com.designPatterns.gangOfFour.behavioral.memento.util;

import com.designPatterns.gangOfFour.behavioral.memento.Graphic;

public class Constraint {

	private Graphic startConnection;
	private Graphic endConnection;

	public Constraint(Graphic startConnection, Graphic endConnection) {
		this.startConnection = startConnection;
		this.endConnection = endConnection;
	}
	
	public Constraint(Constraint constraint) {
		this.startConnection = constraint.getStartConnection().clone();
		this.endConnection = constraint.getEndConnection().clone();
	}

	public Graphic getStartConnection() {
		return startConnection;
	}

	public Graphic getEndConnection() {
		return endConnection;
	}

	@Override
	public String toString() {
		return "Constraint [startConnection=" + startConnection + ", endConnection=" + endConnection + "]";
	}
	
}

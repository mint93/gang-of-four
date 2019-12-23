package com.designPatterns.gangOfFour.behavioral.memento;

import com.designPatterns.gangOfFour.behavioral.memento.util.Point;

public class Client {
	
	public static void main(String[] args) {
		Graphic graphic1 = new Graphic();
		Graphic graphic2 = new Graphic();
		connectGraphics(graphic1, graphic2);
		MoveCommand moveCommand = new MoveCommand(graphic2, new Point(5, 5));
		System.out.println("Move graphic");
		moveCommand.execute();
		System.out.println("Undo last action");
		moveCommand.unexecute();
	}

	private static void connectGraphics(Graphic startGraphic, Graphic endGraphic) {
		ConstraintSolver.instance().addConstraint(startGraphic, endGraphic);
	}
	
}

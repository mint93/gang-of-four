package com.designPatterns.gangOfFour.behavioral.memento;

import com.designPatterns.gangOfFour.behavioral.memento.ConstraintSolver.ConstraintSolverMemento;
import com.designPatterns.gangOfFour.behavioral.memento.util.Point;

// Caretaker (undo mechanism) - is responsible for the memento's safekeeping.
// It never operates on or examines the contents of a memento.
public class MoveCommand {
	
	// A caretaker requests a memento from an originator, holds it for a time,
	// and passes it back to the originator. Sometimes the caretaker won't
	// pass the memento back to the originator, because the originator might
	// never need to revert to an earlier state.
	private ConstraintSolverMemento state;
	private Point delta;
	private Graphic target;
	
	public MoveCommand(Graphic target, Point delta) {
		this.target = target;
		this.delta = delta;
	}
	
	public void execute() {
		ConstraintSolver solver = ConstraintSolver.instance();
		state = solver.createMemento(); // create a memento
		target.move(delta);
		solver.solve();
	}
	public void unexecute() {
		ConstraintSolver solver = ConstraintSolver.instance();
		target.move(new Point(-delta.getX(), -delta.getY()));
		solver.setMemento(state); // restore solver state
		solver.solve();
	}
}
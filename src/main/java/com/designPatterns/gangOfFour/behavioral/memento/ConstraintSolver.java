package com.designPatterns.gangOfFour.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.designPatterns.gangOfFour.behavioral.memento.util.Constraint;

// Originator - creates a memento containing a snapshot of its current
// internal state. It uses the memento to restore its internal state.
public class ConstraintSolver {

	private List<Constraint> constraints = new ArrayList<>();
	
	private static ConstraintSolver constraintSolver;
	
	private ConstraintSolver() {}
	
	// ConstraintSolver is a Singleton
	public static ConstraintSolver instance() {
		if (constraintSolver == null) {
			constraintSolver = new ConstraintSolver();
		}
		return constraintSolver;
	}
	
	public void solve() {
		System.out.println("Solve constraints: " + constraints);
	}
	public void addConstraint(Graphic startConnection, Graphic endConnection) {
		constraints.add(new Constraint(startConnection, endConnection));
	}
	public void removeConstraint(Graphic startConnection, Graphic endConnection) {
		constraints.stream()
			.filter(constraint -> constraint.getStartConnection().equals(startConnection) &&
					              constraint.getEndConnection().equals(endConnection))
			.findFirst()
			.ifPresent(constraint -> constraints.remove(constraint));
	}
	public ConstraintSolverMemento createMemento() {
		return new ConstraintSolverMemento(constraints);
	}
	public void setMemento(ConstraintSolverMemento constraintSolverMemento) {
		this.constraints = constraintSolverMemento.constraints;
	}
	
	// Memento - stores internal state of the Originator object. The memento
	// may store as	much or as little of the originator's internal state as
	// necessary at its originator's discretion. Memento protects against
	// access by objects other than the originator. Mementos have effectively
	// two interfaces. Caretaker sees a narrow interface to the Memento—it
	// can only pass the memento to other objects. Originator, in contrast,
	// sees a wide interface, one that lets it access all the data necessary
	// to restore itself to its previous state. Ideally, only the originator
	// that produced the memento would be permitted to access the memento's
	// internal state.
	public class ConstraintSolverMemento {

		private List<Constraint> constraints;
		
		private ConstraintSolverMemento(List<Constraint> constraints) {
			this.constraints= constraints.stream()
				.map(Constraint::new)
				.collect(Collectors.toList());				
		}
	}
}
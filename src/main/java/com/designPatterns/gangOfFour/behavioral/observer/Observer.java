package com.designPatterns.gangOfFour.behavioral.observer;

// Observer - defines an updating interface for objects that should be
// notified of changes in a subject.
public interface Observer {
	public void update(Subject theChangedSubject);
}

package com.designPatterns.gangOfFour.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject - knows its observers. Any number of Observer objects may observe
// a subject. It provides an interface for attaching and detaching Observer
// objects
public abstract class Subject {
	
	// The subject doesn't know the concrete class of any observer.
	// Thus the coupling between subjects and observers is abstract
	// and minimal. Because Subject and Observer aren't tightly coupled,
	// they can belong to different layers of abstraction in a system.
	private	List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	// The subject doesn't care how many interested objects exist;
	// its only responsibility is to notify its observers.
	// This gives you the freedom to add and remove observers at any time.
	// It's up to the observer to handle or ignore a notification.
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(this));
	}
}
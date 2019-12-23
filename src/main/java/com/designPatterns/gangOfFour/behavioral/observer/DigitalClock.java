package com.designPatterns.gangOfFour.behavioral.observer;

import com.designPatterns.gangOfFour.behavioral.observer.util.Widget;

//ConcreteObserver - maintains a reference to a ConcreteSubject object,
//stores state that should stay consistent with the subject's.
//In order to keep its state consistent with the subject's,
//it implements the Observer updating interface
public class DigitalClock extends Widget implements Observer {
	
	private ClockTimer subject;
	
	public DigitalClock () {
		subject.detach(this);
	}
	
	public DigitalClock(ClockTimer clockTimer) {
		this.subject = clockTimer;
		this.subject.attach(this);
	}
	
	@Override
	public void update(Subject theChangedSubject) {
		if (theChangedSubject == subject) {
			draw();
		}
	}
	
	public void draw() {
		// After being informed of a change in the concrete subject,
		// a ConcreteObserver object may query the subject for information.
		// ConcreteObserver uses this information to reconcile its state
		// with that of the subject.
		int hour = subject.getHour();
		int minute = subject.getMinute();
		int second = subject.getSecond();
		System.out.println(String.format("Digital Clock: %02d:%02d:%02d", hour, minute, second));
	}
	
}

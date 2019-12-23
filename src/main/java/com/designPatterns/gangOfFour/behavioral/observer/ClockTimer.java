package com.designPatterns.gangOfFour.behavioral.observer;

import java.util.concurrent.atomic.AtomicInteger;

// ConcreteSubject - stores state of interest to ConcreteObserver objects.
// It sends a notification to its observers when its state changes.
public class ClockTimer extends Subject {
	
	private AtomicInteger second = new AtomicInteger();
	private AtomicInteger minute = new AtomicInteger();
	private AtomicInteger hour = new AtomicInteger();
	
	public int getHour() {
		return hour.get();
	}
	public int getMinute() {
		return minute.get();
	}
	public int getSecond() {
		return second.get();
	}
	public void tick() {
		updateInternalTime();
		notifyObservers();
	}
	private void updateInternalTime() {
		if (second.get() < 60) {
			second.incrementAndGet();
		}
		if (second.get() == 60) {
			second.compareAndSet(60, 0);
			if (minute.get() < 60) {
				minute.incrementAndGet();
			} 
			if (minute.get() == 60) {
				minute.compareAndSet(60, 0);
				hour.incrementAndGet();
			}
		}
	}
}
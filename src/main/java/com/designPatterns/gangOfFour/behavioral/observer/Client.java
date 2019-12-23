package com.designPatterns.gangOfFour.behavioral.observer;

import com.designPatterns.gangOfFour.behavioral.observer.util.Timer;

public class Client {

	public static void main(String[] args) {
		ClockTimer clockTimer = new ClockTimer();
		AnalogClock analogClock = new AnalogClock(clockTimer);
		DigitalClock digitalClock = new DigitalClock(clockTimer);
		
		Timer timer = new Timer(clockTimer);
		timer.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.stop();
	}
	
}

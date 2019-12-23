package com.designPatterns.gangOfFour.behavioral.observer.util;

import com.designPatterns.gangOfFour.behavioral.observer.ClockTimer;

class TimerTask implements Runnable {

	private ClockTimer clock;
	
	public TimerTask(ClockTimer clock) {
		this.clock = clock;
	}

	@Override
	public void run() {
		clock.tick();
	}

}

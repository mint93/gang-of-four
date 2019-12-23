package com.designPatterns.gangOfFour.behavioral.observer.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.designPatterns.gangOfFour.behavioral.observer.ClockTimer;

public class Timer {

	private TimerTask timerTask;
	ScheduledExecutorService executor;
	
	public Timer(ClockTimer clockTimer) {
		this.timerTask = new TimerTask(clockTimer);
		executor = Executors.newScheduledThreadPool(1);
	}
	
	public void start() {
		executor.scheduleAtFixedRate(timerTask, 1, 1, TimeUnit.SECONDS);
	}
	
	public void stop() {
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}

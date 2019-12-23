package com.designPatterns.gangOfFour.structual.bridge;

import com.designPatterns.gangOfFour.structual.bridge.util.WindowSystemType;

public class WindowSystemFactorySingleton {
	private static WindowSystemFactory instance;
	
	private WindowSystemFactorySingleton() {}
	
	public static WindowSystemFactory getInstance() {
		if (instance == null) {
			switch(readSystemType()) {
			case X_WINDOW_SYSTEM:
				instance = new XWindowSystemFactory();
				break;
			case PM_WINDOW_SYSTEM:
				instance = new PmWindowSystemFactory();
				break;
			}
	    }
		return instance;
	}
	
	public static WindowSystemType readSystemType() {
		return WindowSystemType.X_WINDOW_SYSTEM;
		//return WindowSystemType.PM_WINDOW_SYSTEM;
	}
}
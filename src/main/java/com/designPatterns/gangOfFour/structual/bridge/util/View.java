package com.designPatterns.gangOfFour.structual.bridge.util;

import com.designPatterns.gangOfFour.structual.bridge.ApplicationWindow;

public class View {
	public void drawOn(ApplicationWindow w) {
		System.out.println("View drawOn: " + w);
	}
}
package com.designPatterns.gangOfFour.structual.bridge;

import com.designPatterns.gangOfFour.structual.bridge.util.View;

// RefinedAbstraction - extends the interface defined by Abstraction
public class ApplicationWindow extends Window {
	public ApplicationWindow(View contents) {
		super(contents);
	}

	@Override
	public void drawContents() {
		getView().drawOn(this);
	}

	@Override
	public void open() {
		System.out.println("ApplicationWindow opening");
	}

	@Override
	public void close() {
		System.out.println("ApplicationWindow closing");
	}

	@Override
	public void iconify() {
		System.out.println("ApplicationWindow iconifying");
	}

	@Override
	public void deiconify() {
		System.out.println("ApplicationWindow deiconifying");
	}

	@Override
	public String toString() {
		return "ApplicationWindow";
	}

}

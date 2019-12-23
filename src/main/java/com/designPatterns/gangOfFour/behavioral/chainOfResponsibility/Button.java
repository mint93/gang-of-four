package com.designPatterns.gangOfFour.behavioral.chainOfResponsibility;

import com.designPatterns.gangOfFour.behavioral.chainOfResponsibility.util.Topic;

class Button extends Widget {
	public Button(Widget parent, Topic topic) {
		super(parent, topic);
	}

	@Override
	protected void showHelp() {
		System.out.println("Showing help on the Button");
	}
	
	// Widget operations that Button overrides...
}
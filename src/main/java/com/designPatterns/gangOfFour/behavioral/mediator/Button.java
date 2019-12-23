package com.designPatterns.gangOfFour.behavioral.mediator;

import com.designPatterns.gangOfFour.behavioral.mediator.util.MouseEvent;

public class Button extends Widget {
	
	public Button(DialogDirector dialogDirector) {
		super(dialogDirector);
	}
	public void setText(String text) {
		System.out.println("Setting text on button: " + text);
	}
	@Override
	public void handleMouse(MouseEvent event) {
		changed();
	}
}
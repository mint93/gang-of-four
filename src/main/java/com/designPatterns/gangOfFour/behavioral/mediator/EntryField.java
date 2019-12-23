package com.designPatterns.gangOfFour.behavioral.mediator;

import com.designPatterns.gangOfFour.behavioral.mediator.util.MouseEvent;

public class EntryField extends Widget {
	private String text;
	
	public EntryField(DialogDirector dialogDirector) {
		super(dialogDirector);
	}
	
	@Override
	public void handleMouse(MouseEvent event) {}
	
	public void setText(String text) {
		this.text = text;
		System.out.println("Display text on entry field: " + text);
	}
	public String getText() {
		return text;
	}
}
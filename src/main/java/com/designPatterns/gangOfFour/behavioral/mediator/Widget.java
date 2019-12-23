package com.designPatterns.gangOfFour.behavioral.mediator;

import com.designPatterns.gangOfFour.behavioral.mediator.util.MouseEvent;

public abstract class Widget {
	private DialogDirector director;
	
	public Widget(DialogDirector dialogDirector) {
		this.director = dialogDirector;
	}
	public void changed() {
		director.widgetChanged(this);
	}
	public abstract void handleMouse(MouseEvent event);
	
}
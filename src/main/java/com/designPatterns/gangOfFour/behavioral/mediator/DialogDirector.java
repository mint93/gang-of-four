package com.designPatterns.gangOfFour.behavioral.mediator;

import com.designPatterns.gangOfFour.behavioral.mediator.util.Dialog;

// There's no need to define an abstract Mediator class when colleagues
// work with only one mediator. The abstract coupling, that the Mediator
// class provides lets colleagues work with different Mediator subclasses.
public interface DialogDirector {
	public Dialog showDialog();
	public void widgetChanged(Widget theChangedWidget);
	public void createWidgets();
}
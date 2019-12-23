package com.designPatterns.gangOfFour.behavioral.chainOfResponsibility;

import com.designPatterns.gangOfFour.behavioral.chainOfResponsibility.util.Topic;

// All widgets are subclasses of the Widget abstract class. Widget is a
// subclass of HelpHandler, since all user interface elements can have
// help associated with them.
public abstract class Widget extends HelpHandler {
	private	Widget parent;
	
	protected Widget() {
		super(null, Topic.NO_HELP_TOPIC);
	}
	
	protected Widget(Widget parent, Topic topic) {
		super(parent, topic);
		this.parent = parent;
	}
}

package com.designPatterns.gangOfFour.behavioral.chainOfResponsibility;

import com.designPatterns.gangOfFour.behavioral.chainOfResponsibility.util.Topic;

public class Dialog extends Widget {
	// Note that successor of Dialog is not a widget, but any help handler.
	// Moreover, its successor could be changed dynamically. So no matter
	// where a dialog is used, you'll get the proper context-dependent help
	// information for it.
	public Dialog(HelpHandler helpHandler, Topic topic) {
		super();
		setHandler(helpHandler, topic);
	}

	@Override
	protected void showHelp() {
		System.out.println("Showing help on the Dialog");
	}
	// Widget operations that Dialog overrides...
}

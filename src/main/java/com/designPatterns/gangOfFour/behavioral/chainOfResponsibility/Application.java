package com.designPatterns.gangOfFour.behavioral.chainOfResponsibility;

import com.designPatterns.gangOfFour.behavioral.chainOfResponsibility.util.Topic;

class Application extends HelpHandler {
	public Application(Topic topic) {
		super(null, topic);
	}
	
	@Override
	protected void showHelp() {
		System.out.println("Showing list of help topics in application");
	}
	// application-specific operations...
}
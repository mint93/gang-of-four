package com.designPatterns.gangOfFour.behavioral.chainOfResponsibility;

import com.designPatterns.gangOfFour.behavioral.chainOfResponsibility.util.Topic;

public class Client {

	public static void main(String[] args) {
		Application application = new Application(Topic.APPLICATION_TOPIC);
		Dialog dialog = new Dialog(application, Topic.PRINT_TOPIC);
		Button button = new Button(dialog, Topic.PAPER_ORIENTATION_TOPIC);
		
		// We can invoke the help request by calling handleHelp on any object
		// on the chain.
		// To start the search at the button object, just call handleHelp on it.
		// In this case, the button will handle the request immediately.
		button.handleHelp();
	}
	
}

package com.designPatterns.gangOfFour.behavioral.command;

import com.designPatterns.gangOfFour.behavioral.command.util.Application;
import com.designPatterns.gangOfFour.behavioral.command.util.Document;

// ConcreteCommand - defines a binding between a Receiver object and
// an action. It implements Execute by invoking the corresponding
// operation(s) on Receiver.
public class OpenCommand implements Command {
	private	Application application;
	
	public OpenCommand(Application application) {
		this.application = application;
	}
	@Override
	public void execute() {
		String name = askUser();
		if (name != null && !name.isEmpty()) {
			Document document = new Document(name);
			application.add(document);
			document.open();
		}
	}
	// askUser is an implementation routine that prompts the user
	// for the name of the document to open.
	protected String askUser() {
		return "documentName";
	}
}
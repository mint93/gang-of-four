package com.designPatterns.gangOfFour.behavioral.command;

import com.designPatterns.gangOfFour.behavioral.command.util.Application;
import com.designPatterns.gangOfFour.behavioral.command.util.Document;

public class Client {
	public static void main(String[] args) {
		// Receivers
		Application application = new Application();
		Document document = new Document("documentName");
		Receiver receiver = new Receiver();
		// Commands
		OpenCommand openCommand = new OpenCommand(application);
		PasteCommand pasteCommand = new PasteCommand(document);
		// For simple commands that don't require arguments
		Command command = () -> receiver.printText();
		
		openCommand.execute();
		pasteCommand.execute();
		command.execute();
		
		// MacroCommand example
		Command macroCommand1 = () -> System.out.println("MacroCommand1");
		Command macroCommand2 = () -> System.out.println("MacroCommand2");
		Command macroCommand3 = () -> System.out.println("MacroCommand3");
		MacroCommand macroCommand = new MacroCommand();
		macroCommand.add(macroCommand1);
		macroCommand.add(macroCommand2);
		macroCommand.add(macroCommand3);
		macroCommand.execute();
	}
}

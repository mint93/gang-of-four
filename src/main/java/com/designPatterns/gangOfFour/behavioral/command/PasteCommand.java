package com.designPatterns.gangOfFour.behavioral.command;

import com.designPatterns.gangOfFour.behavioral.command.util.Document;

// ConcreteCommand - defines a binding between a Receiver object and
// an action. It implements Execute by invoking the corresponding
// operation(s) on Receiver.
public class PasteCommand implements Command {
	private	Document document;
	// PasteCommand's receiver is the Document object it is supplied
	// upon	instantiation. The Execute operation invokes Paste on
	// the receiving Document.
	public PasteCommand(Document document) {
		this.document = document;
	}
	
	@Override
	public void execute() {
		document.paste();
	}

}
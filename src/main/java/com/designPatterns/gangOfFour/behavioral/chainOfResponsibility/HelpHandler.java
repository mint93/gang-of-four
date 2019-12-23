package com.designPatterns.gangOfFour.behavioral.chainOfResponsibility;

import com.designPatterns.gangOfFour.behavioral.chainOfResponsibility.util.Topic;

// The HelpHandler class defines the interface for handling help requests.
// It maintains a help topic (which is empty by default) and keeps a
// reference to its successor on the chain of help handlers.
public abstract class HelpHandler {
	private HelpHandler successor;
	private	Topic topic = Topic.NO_HELP_TOPIC;
	
	public	HelpHandler(HelpHandler helpHandler, Topic topic) {
		this.successor = helpHandler;
		this.topic = topic;
	}
	public boolean hasHelp() {
		return topic != Topic.NO_HELP_TOPIC;
	}
	public void setHandler(HelpHandler helpHandler, Topic topic) {
		this.successor = helpHandler;
		this.topic = topic;
	}
	public void handleHelp() {
		if (hasHelp()) {
			showHelp();
		} else if (successor != null) {
			successor.handleHelp();
		}
	}
	protected abstract void showHelp();

}
package com.designPatterns.gangOfFour.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// MacroCommand is a concrete Command subclass that simply executes
// a sequence of Commands. MacroCommand has no explicit receiver,
// because the commands it sequences define their own receiver.
class MacroCommand implements Command {
	private List<Command> commands = new ArrayList<>();
	
	public void add(Command command) {
		commands.add(command);
	}
	public void remove(Command command) {
		commands.remove(command);
	}
	
	@Override
	public void execute() {
		commands.forEach(command ->	command.execute());
	}
	
}
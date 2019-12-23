package com.designPatterns.gangOfFour.structual.facade;

public interface Parser {
	public abstract void parse(Scanner scanner, ProgramNodeBuilder programNodeBuilder);
}
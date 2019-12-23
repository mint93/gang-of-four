package com.designPatterns.gangOfFour.structual.facade;

public class ParserImpl implements Parser {

	@Override
	public void parse(Scanner scanner, ProgramNodeBuilder programNodeBuilder) {
		System.out.println("ParserImpl::parse");
	}

}

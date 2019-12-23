package com.designPatterns.gangOfFour.behavioral.command.util;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	private List<Document> documents = new ArrayList<>();

	public void add(Document document) {
		documents.add(document);
	}

}

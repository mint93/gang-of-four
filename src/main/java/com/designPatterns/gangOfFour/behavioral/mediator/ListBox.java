package com.designPatterns.gangOfFour.behavioral.mediator;

import java.util.List;

import com.designPatterns.gangOfFour.behavioral.mediator.util.MouseEvent;

public class ListBox extends Widget {
	private List<String> listItems;
	private String selected;
	
	public ListBox(DialogDirector dialogDirector) {
		super(dialogDirector);
	}
	public String getSelection() {
		return selected;
	}

	public void setList(List<String> listltems) {
		this.listItems = listltems;
	}
	@Override
	public void handleMouse(MouseEvent event) {
		if (listItems.contains(event.getTargetText())) {
			selected = event.getTargetText();
			System.out.println("Selected item from list: " + selected);
			changed();
		}
	}
}
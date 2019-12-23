package com.designPatterns.gangOfFour.behavioral.mediator.util;

public class MouseEvent {

	private String targetText;
	
	public MouseEvent(String targetText) {
		this.targetText = targetText;
	}

	public MouseEvent() {}

	public String getTargetText() {
		return targetText;
	}

}

package com.designPatterns.gangOfFour.behavioral.mediator;

import com.designPatterns.gangOfFour.behavioral.mediator.util.Dialog;

public class Client {

	public static void main(String[] args) {
		FontDialogDirector fontDialogDirector = new FontDialogDirector();
		fontDialogDirector.createWidgets();
		Dialog dialog = fontDialogDirector.showDialog();
		dialog.selectFont("font1");
		dialog.clickOkButton();
	}
	
}

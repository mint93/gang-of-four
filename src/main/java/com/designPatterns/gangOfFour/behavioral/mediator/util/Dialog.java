package com.designPatterns.gangOfFour.behavioral.mediator.util;

import com.designPatterns.gangOfFour.behavioral.mediator.Button;
import com.designPatterns.gangOfFour.behavioral.mediator.EntryField;
import com.designPatterns.gangOfFour.behavioral.mediator.ListBox;

public class Dialog {

	private Button ok;
	private Button cancel;
	private ListBox fontList;
	private EntryField fontName;

	public Dialog(Button ok, Button cancel, ListBox fontList, EntryField fontName) {
		this.ok = ok;
		this.cancel = cancel;
		this.fontList = fontList;
		this.fontName = fontName;
	}
	
	public void clickOkButton() {
		ok.handleMouse(new MouseEvent());
	}
	
	public void clickCancelButton() {
		cancel.handleMouse(new MouseEvent());
	}
	
	public void selectFont(String fontName) {
		fontList.handleMouse(new MouseEvent(fontName));
	}

	public void applyFont(String fontName) {
		System.out.println("Font applied: " + fontName);
	}

	public void dismiss() {
		System.out.println("Dialog dismissed");
	}

}

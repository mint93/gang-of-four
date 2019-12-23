package com.designPatterns.gangOfFour.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.gangOfFour.behavioral.mediator.util.Dialog;

// ConcreteMediator - implements cooperative behavior by coordinating
// Colleague objects, knows and maintains its colleagues.
class FontDialogDirector implements DialogDirector {
	private Button ok;
	private	Button cancel;
	private	ListBox fontList;
	private	EntryField fontName;
	private Dialog dialog;
	
	@Override
	public void widgetChanged(Widget theChangedWidget) {
		if (theChangedWidget == fontList) {
			fontName.setText(fontList.getSelection());
		} else if (theChangedWidget == ok) {
			dialog.applyFont(fontName.getText());
			dialog.dismiss();	
		} else if (theChangedWidget == cancel) {
			dialog.dismiss();
		}
	}
	@Override
	public void createWidgets() {
		ok = new Button(this);
		cancel = new Button(this);
		fontList = new ListBox(this);
		fontName = new EntryField(this);
		// fill the listBox with the available font names
		fontList.setList(getFontList());
	}
	private List<String> getFontList() {
		List<String> fonts = new ArrayList<String>();
		fonts.add("font1");
		fonts.add("font2");
		fonts.add("font3");
		return fonts;
	}
	@Override
	public Dialog showDialog() {
		dialog = new Dialog(ok, cancel, fontList, fontName);
		return dialog;
	}
}
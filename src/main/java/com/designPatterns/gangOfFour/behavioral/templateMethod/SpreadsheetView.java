package com.designPatterns.gangOfFour.behavioral.templateMethod;

// ConcreteClass - implements the primitive operations to carry out
// subclass-specific steps of the algorithm.
public class SpreadsheetView extends View {

	@Override
	protected void doDisplay() {
		System.out.println("Displaying Spreadsheet view");
	}

}

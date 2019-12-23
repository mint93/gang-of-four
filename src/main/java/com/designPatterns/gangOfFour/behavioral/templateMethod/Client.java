package com.designPatterns.gangOfFour.behavioral.templateMethod;

public class Client {

	public static void main(String[] args) {
		View drawView = new DrawView();
		View spreadsheetView = new SpreadsheetView();
		System.out.println("DrawView:");
		drawView.display();
		System.out.println("\nSpreadsheetView:");
		spreadsheetView.display();
	}
	
}

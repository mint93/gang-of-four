package com.designPatterns.gangOfFour.structual.adapter;

import com.designPatterns.gangOfFour.structual.adapter.classAdapter.TextShape;
import com.designPatterns.gangOfFour.structual.adapter.util.Coord;

public class Client {

	public static void main(String[] args) {
		System.out.println("Class Adapter");
		Coord bottom = new Coord();
		Coord left= new Coord();
		Coord width = new Coord();
		Coord height = new Coord();
		Shape textShape1 = new TextShape(bottom, left, width, height);
		textShape1.boundingBox();
		textShape1.createManipulator();
		
		System.out.println("\nObject Adapter");
		TextView textView = new TextView(bottom, left, width, height);
		Shape textShape2 = new com.designPatterns.gangOfFour.structual.adapter.objectAdapter.TextShape(textView );
		textShape2.boundingBox();
		textShape2.createManipulator();
	}
}

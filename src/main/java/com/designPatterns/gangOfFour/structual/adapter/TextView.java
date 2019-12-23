package com.designPatterns.gangOfFour.structual.adapter;

import com.designPatterns.gangOfFour.structual.adapter.util.Coord;

// Adaptee - defines an existing interface that needs adapting.
public class TextView {
	private Coord bottom;
	private Coord left;
	private Coord width;
	private Coord height;
	private boolean isEmpty = false;
	
	public TextView(Coord bottom, Coord left, Coord width, Coord height) {
		this.bottom = bottom;
		this.left = left;
		this.width = width;
		this.height = height;
	}
	
	public Coord getOriginBottom() {
		System.out.println("TextView::getOriginBottom");
		return bottom;
	}
	public Coord getOriginLeft() {
		System.out.println("TextView::getOriginLeft");
		return left;
	}
	public Coord getWidth() {
		System.out.println("TextView::getWidth");
		return width;
	}
	public Coord getHeight() {
		System.out.println("TextView::getHeight");
		return height;
	}
	public boolean isEmpty() {
		System.out.println("TextView::isEmpty");
		return isEmpty;
	}
}
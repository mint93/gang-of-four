package com.designPatterns.gangOfFour.behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		Composition quick = new Composition(new SimpleCompositor());
		quick.repair();
		Composition slick = new Composition(new TeXCompositor());
		slick.repair();
		Composition iconic = new Composition(new ArrayCompositor(100));
		iconic.repair();
	}
}

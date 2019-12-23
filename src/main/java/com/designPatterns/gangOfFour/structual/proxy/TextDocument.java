package com.designPatterns.gangOfFour.structual.proxy;

import com.designPatterns.gangOfFour.structual.proxy.util.Extent;

public class TextDocument {
	
	private Graphic graphic;
	
	public void insert(Graphic graphic) {
		this.graphic = graphic;
		System.out.println("Interting graphic with extent: " + graphic.getExtent());
	}

	public void draw() {
		if (graphic != null) {
			System.out.println("Drawing document");
			graphic.draw(new Extent(5, 5));
		}
	}
}
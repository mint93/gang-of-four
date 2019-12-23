package com.designPatterns.gangOfFour.structual.proxy.util;

// It is width and height. The extent lets the proxy respond to requests
// for its size from the formatter without actually instantiating the image.
public class Extent {
	
	private int width;
	private int height;

	public Extent(int x, int y) {
		this.width = x;
		this.height = y;
	}

	public static Extent Zero() {
		return new Extent(0, 0);
	}

	public boolean isZero() {
		return width == 0 && height == 0;
	}

	@Override
	public String toString() {
		return width + "x" + height;
	}

}

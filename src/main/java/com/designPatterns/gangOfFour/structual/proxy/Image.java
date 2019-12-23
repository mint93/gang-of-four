package com.designPatterns.gangOfFour.structual.proxy;

import java.io.InputStream;
import java.io.OutputStream;

import com.designPatterns.gangOfFour.structual.proxy.util.Event;
import com.designPatterns.gangOfFour.structual.proxy.util.Extent;

public class Image implements Graphic {
	
	private	String fileName;
	private	Extent extent;

	// loads image from a file
	public Image(String fileName) {
		this.fileName = fileName;
		System.out.println("Loading image from the file: " + fileName);
	}
	@Override
	public void draw(Extent extent) {
		System.out.println("Drawing image: " + fileName + ", with extent: " + extent);
	}
	@Override
	public void handleMouse(Event event) {
		System.out.println("Handling mouse event: " + event.toString());
	}
	@Override
	public Extent getExtent() {
		return extent;
	}
	@Override
	public void load(InputStream from) {
		System.out.println("Loading image from input stream");
	}
	@Override
	public void save(OutputStream to) {
		System.out.println("Saving image to output stream: " + fileName);
	}
	
}

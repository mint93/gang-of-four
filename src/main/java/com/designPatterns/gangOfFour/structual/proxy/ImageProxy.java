package com.designPatterns.gangOfFour.structual.proxy;

import java.io.InputStream;
import java.io.OutputStream;

import com.designPatterns.gangOfFour.structual.proxy.util.Event;
import com.designPatterns.gangOfFour.structual.proxy.util.Extent;

// This is example of a virtual proxy - it creates expensive objects on demand.
// Virtual proxies may cache additional information about the real subject
// so that they can postpone accessing it. For example, the ImageProxy
// caches the real image's extent.
class ImageProxy implements Graphic {
	
	private Image image;
	private	Extent extent;
	private	String fileName;
	
	public ImageProxy(String imageFile) {
		this.fileName = imageFile;
		this.extent = Extent.Zero(); // don't know extent yet
		this.image = null;
	}
	
	@Override
	public void draw(Extent extent) {
		getImage().draw(extent);
	}
	@Override
	public void handleMouse(Event event) {
		getImage().handleMouse(event);
	}
	// The implementation of GetExtent returns the cached extent if possible;
	// otherwise the image is loaded from the file.
	@Override
	public Extent getExtent() {
		if (image == null) {
			return extent;
		}
		return getImage().getExtent();
	}
	@Override
	public void load(InputStream from) {
		System.out.println("Loading image from input stream");
	}
	@Override
	public void save(OutputStream to) {
		System.out.println("Saving image to output stream: " + toString());
	}
	
	protected Image getImage() {
		if (image == null) {
	        image = new Image(fileName);
	    }
	    return image;
	}
	
	@Override
	public String toString() {
		return "Image [fileName=" + fileName + ", extent=" + extent + "]";
	}
	
}
package com.designPatterns.gangOfFour.structual.proxy;

import java.io.InputStream;
import java.io.OutputStream;

import com.designPatterns.gangOfFour.structual.proxy.util.Event;
import com.designPatterns.gangOfFour.structual.proxy.util.Extent;

public interface Graphic {
	public void draw(Extent extent);
	public void handleMouse(Event event);
	public Extent getExtent();
	public void load(InputStream from);
	public void save(OutputStream to);
}
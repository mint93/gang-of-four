package com.designPatterns.gangOfFour.structual.bridge;

import java.awt.Point;

import com.designPatterns.gangOfFour.structual.bridge.util.Display;
import com.designPatterns.gangOfFour.structual.bridge.util.Drawable;
import com.designPatterns.gangOfFour.structual.bridge.util.GraphicContext;

// ConcreteImplementor
public class XWindowImplementor extends WindowImplementor {
	// lots of X window system-specific state, including:
	private Display display;
	private Drawable windowId; // window id
	private GraphicContext graphicContext; // window graphic context
	
	@Override
	public void deviceRect(int x0, int y0, int x1, int y1) {
		int x = Math.min(x0, x1);
		int y = Math.min(y0, y1);
		int w = Math.abs(x0 - x1);
		int h = Math.abs(y0 - y1);
		System.out.println("XWindowImp deviceRect: x=" + x + ", y=" + y + ", w=" + w + ", h=" + h);
		xDrawRectangle(display, windowId, graphicContext, x, y, w, h);
	}
	
	// XDrawRectangle is the X interface for drawing a rectangle
	private void xDrawRectangle(Display display2, Drawable windowId2, GraphicContext graphicContext2, int x, int y,
			int w, int h) {
	}

	@Override
	public void impTop() {
		System.out.println("XWindowImp impTop");
	}

	@Override
	public void impBottom() {
		System.out.println("XWindowImp impBottom");
	}

	@Override
	public void impSetExtent(Point p) {
		System.out.println("XWindowImp impSetExtent for point: " + p);
	}

	@Override
	public void impSetOrigin(Point p) {
		System.out.println("XWindowImp impSetOrigin for point: " + p);
	}

	@Override
	public void deviceText(String text, int x, int y) {
		System.out.println("XWindowImp deviceText: " + text + ": " + x + ", " + y);
	}

	@Override
	public void deviceBitmap(String bitmapName, int x, int y) {
		System.out.println("XWindowImp deviceBitmap: " + bitmapName + ": " + x + ", " + y);
	}
}
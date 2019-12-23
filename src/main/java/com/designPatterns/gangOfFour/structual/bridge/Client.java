package com.designPatterns.gangOfFour.structual.bridge;

import java.awt.Point;

import com.designPatterns.gangOfFour.structual.bridge.util.View;

public class Client {
	public static void main(String[] args) {
		View view = new View();
		Window iconWindow = new IconWindow(view, "Icon Window");
		iconWindow.open();
		iconWindow.iconify();
		iconWindow.drawRect(new Point(0, 1), new Point(2, 2));
		iconWindow.drawContents();
		iconWindow.drawText("text to draw", new Point(1,1));
		iconWindow.close();
		Window applicationWindow = new ApplicationWindow(view);
		applicationWindow.open();
		applicationWindow.iconify();
		applicationWindow.drawRect(new Point(0, 1), new Point(2, 2));
		applicationWindow.drawContents();
		applicationWindow.drawText("text to draw", new Point(1,1));
		applicationWindow.close();
	}
}

package com.designPatterns.gangOfFour.structual.bridge;

import com.designPatterns.gangOfFour.structual.bridge.util.View;

// RefinedAbstraction - extends the interface defined by Abstraction
public class IconWindow extends Window {
	private String bitmapName;
	
	public IconWindow(View contents, String bitmapName) {
		super(contents);
		this.bitmapName = bitmapName;
	}

	@Override
	public void drawContents() {
		WindowImplementor imp = getWindowImp();
		if (imp != null) {
			imp.deviceBitmap(bitmapName, 0, 0);
		}
	}

	@Override
	public void open() {
		System.out.println("IconWindow opening");
	}

	@Override
	public void close() {
		System.out.println("IconWindow closing");
	}

	@Override
	public void iconify() {
		System.out.println("IconWindow iconifying");
	}

	@Override
	public void deiconify() {
		System.out.println("IconWindow deiconifying");
	}
	
};
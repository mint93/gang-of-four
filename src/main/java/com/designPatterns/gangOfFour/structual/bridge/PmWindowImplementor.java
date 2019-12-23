package com.designPatterns.gangOfFour.structual.bridge;

import java.awt.Point;

import com.designPatterns.gangOfFour.structual.bridge.util.HPS;

// ConcreteImplementor
class PmWindowImplementor extends WindowImplementor {
	private static final String GPI_ERROR = "error";
	// lots of PM window system-specific state, including:
	private HPS hps = new HPS();
	
	@Override
	public void deviceRect(int x0, int y0, int x1, int y1) {
		System.out.println("PmWindowImp deviceRect: x0=" + x0 + ", y0=" + y0 + ", x1=" + x1 + ", y1=" + y1);

		int left = Math.min(x0, x1) ;
		int right = Math.max(x0, x1);
		int bottom = Math.min(y0, y1) ;
		int top = Math.max(y0, y1) ;
		
		Point[] point = new Point[4];
		
		point[0] = new Point(left, top);
		point[1] = new Point(right, top);
		point[2] = new Point(right, bottom);
		point[3] = new Point(left, bottom);
		
		if (
			(gpiBeginPath(hps, 1L) == false) ||
			(gpiSetCurrentPosition(hps, point[3]) == false) ||
			(GPI_ERROR.equals(gpiPolyLine(hps, 4L, point))) ||
			(gpiEndPath(hps) == false)
		) {
			// report error
		} else {
			gpiStrokePath(hps, 1L, 0L);
		}
	}

	private void gpiStrokePath(HPS hps2, long l, long m) {
	}

	private boolean gpiEndPath(HPS hps2) {
		return false;
	}

	private String gpiPolyLine(HPS hps2, long l, Point[] point) {
		return null;
	}

	private boolean gpiSetCurrentPosition(HPS hps2, Point point) {
		return false;
	}

	private boolean gpiBeginPath(HPS hps2, long l) {
		return false;
	}

	@Override
	public void impTop() {
		System.out.println("PmWindowImp impTop");
	}

	@Override
	public void impBottom() {
		System.out.println("PmWindowImp impBottom");
	}

	@Override
	public void impSetExtent(Point p) {
		System.out.println("PmWindowImp impSetExtent for point: " + p);
	}

	@Override
	public void impSetOrigin(Point p) {
		System.out.println("PmWindowImp impSetOrigin for point: " + p);
	}

	@Override
	public void deviceText(String text, int x, int y) {
		System.out.println("PmWindowImp deviceText: " + text + ": " + x + ", " + y);
	}

	@Override
	public void deviceBitmap(String bitmapName, int x, int y) {
		System.out.println("PmWindowImp deviceBitmap: " + bitmapName + ": " + x + ", " + y);
	}
	
}
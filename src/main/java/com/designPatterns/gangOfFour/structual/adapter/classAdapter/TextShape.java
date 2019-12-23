package com.designPatterns.gangOfFour.structual.adapter.classAdapter;

import com.designPatterns.gangOfFour.structual.adapter.Shape;
import com.designPatterns.gangOfFour.structual.adapter.TextView;
import com.designPatterns.gangOfFour.structual.adapter.util.Box;
import com.designPatterns.gangOfFour.structual.adapter.util.Coord;
import com.designPatterns.gangOfFour.structual.adapter.util.Manipulator;
import com.designPatterns.gangOfFour.structual.adapter.util.Point;
import com.designPatterns.gangOfFour.structual.adapter.util.TextManipulator;

// The key to class adapters is to use one inheritance branch to inherit the interface
// and another branch to inherit the implementation.
public class TextShape extends TextView implements Shape {
	
	public TextShape(Coord bottom, Coord left, Coord width, Coord height) {
		super(bottom, left, width, height);
	}
	
	// The boundingBox operation converts Textview's interface to conform to Shape's.
	@Override
	public Box boundingBox() {
		Coord bottom = getOriginBottom();
		Coord left = getOriginLeft();
		Coord width = getWidth();
		Coord height = getHeight();
		Point bottomLeft = new Point(bottom.getCoords(), left.getCoords());
		Point topRight = new Point(bottom.getCoords() + height.getCoords(), left.getCoords() + width.getCoords());
		return new Box(bottomLeft, topRight);
	}
	// The IsEmpty operation demonstrates the direct forwarding of requests common
	// in adapter implementations
	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	// createManipulator is implemented from scratch and doesn't reuse any existing
	// TextView functionality.
	@Override
	public Manipulator createManipulator() {
		return new TextManipulator(this);
	}
}
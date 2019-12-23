package com.designPatterns.gangOfFour.structual.adapter.objectAdapter;

import com.designPatterns.gangOfFour.structual.adapter.Shape;
import com.designPatterns.gangOfFour.structual.adapter.TextView;
import com.designPatterns.gangOfFour.structual.adapter.util.Box;
import com.designPatterns.gangOfFour.structual.adapter.util.Coord;
import com.designPatterns.gangOfFour.structual.adapter.util.Manipulator;
import com.designPatterns.gangOfFour.structual.adapter.util.Point;
import com.designPatterns.gangOfFour.structual.adapter.util.TextManipulator;

// The object adapter uses object composition to combine classes
// with different interfaces.
public class TextShape implements Shape {
	
	private TextView textView;
	
	public TextShape(TextView textView) {
		this.textView = textView;
	}
	@Override
	public Box boundingBox() {
		Coord bottom = textView.getOriginBottom();
		Coord left = textView.getOriginLeft();
		Coord width = textView.getWidth();
		Coord height = textView.getHeight();
		Point bottomLeft = new Point(bottom.getCoords(), left.getCoords());
		Point topRight = new Point(bottom.getCoords() + height.getCoords(), left.getCoords() + width.getCoords());
		return new Box(bottomLeft, topRight);
	}
	public boolean isEmpty() {
		return textView.isEmpty();
	}
	
	// createManipulator is implemented from scratch and doesn't reuse any existing
	// TextView functionality.
	@Override
	public Manipulator createManipulator() {
		return new TextManipulator(this);
	}
	
}
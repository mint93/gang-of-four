package com.designPatterns.gangOfFour.structual.adapter;

import com.designPatterns.gangOfFour.structual.adapter.util.Box;
import com.designPatterns.gangOfFour.structual.adapter.util.Manipulator;

public interface Shape {
	// Box object is a bounding box defined by its opposing corners
	public Box boundingBox();
	// Manipulator object knows how to animate a shape when the user manipulates it.
	public Manipulator createManipulator();
}
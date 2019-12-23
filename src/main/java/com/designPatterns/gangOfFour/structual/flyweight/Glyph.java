package com.designPatterns.gangOfFour.structual.flyweight;

import com.designPatterns.gangOfFour.structual.flyweight.util.Font;
import com.designPatterns.gangOfFour.structual.flyweight.util.Window;

// Abstraction for graphical objects, some of which may be flyweights.
// Operations that may depend on extrinsic state have it passed to
// them as a parameter.
public abstract class Glyph {
	public abstract void draw(Window window, GlyphContext glyphContext);
	
	public abstract void setFont(Font font, GlyphContext glyphContext);
	public abstract Font getFont(GlyphContext glyphContext);
	
	public void insert(Glyph glyph) {
		throw new UnsupportedOperationException();
	}
	public void remove(Glyph glyph) {
		throw new UnsupportedOperationException();
	}
	public Glyph get(int index) {
		throw new UnsupportedOperationException();
	}
	
	public abstract int getLength();
	
}
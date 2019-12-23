package com.designPatterns.gangOfFour.structual.flyweight;

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.gangOfFour.structual.flyweight.util.Font;
import com.designPatterns.gangOfFour.structual.flyweight.util.Window;

// UnsharedConcreteFlyweight - not all Flyweight subclasses need to be
// shared. The Flyweight interface enables sharing; it doesn't enforce it.
// It's common for UnsharedConcreteFlyweight objects to have
// ConcreteFlyweight objects as children at some level in the flyweight
// object structure (like in this case).
public class Column extends Glyph {
	
	private List<Glyph> rows = new ArrayList<>();

	@Override
	public void draw(Window window, GlyphContext glyphContext) {
		rows.forEach(glyph -> glyph.draw(window, glyphContext));
	}

	@Override
	public void setFont(Font font, GlyphContext glyphContext) {
		glyphContext.setFont(font, getLength());
	}

	@Override
	public Font getFont(GlyphContext glyphContext) {
		return glyphContext.getFont();
	}

	@Override
	public void insert(Glyph glyph) {
		rows.add(glyph);
	}

	@Override
	public void remove(Glyph glyph) {
		rows.remove(glyph);
	}
	
	@Override
	public Glyph get(int index) {
		return rows.get(index);
	}

	@Override
	public int getLength() {
		return rows.stream()
				.mapToInt(Glyph::getLength)
				.sum();
	}

}

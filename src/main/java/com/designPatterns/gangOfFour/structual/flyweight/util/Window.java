package com.designPatterns.gangOfFour.structual.flyweight.util;

import com.designPatterns.gangOfFour.structual.flyweight.CharacterGlyph;
import com.designPatterns.gangOfFour.structual.flyweight.GlyphContext;

public class Window {

	public void draw(CharacterGlyph characterGlyph, GlyphContext glyphContext) {
		System.out.println("Drawing character: " + characterGlyph.getCharcode() +
				"(" + characterGlyph + ")" +
				", at position: " + glyphContext.getIndex() +
				", with font: " + glyphContext.getFont().getFontname() +
				"(" + glyphContext.getFont() + ")");
	}

}

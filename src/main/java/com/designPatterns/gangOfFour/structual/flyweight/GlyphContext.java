package com.designPatterns.gangOfFour.structual.flyweight;

import com.designPatterns.gangOfFour.structual.flyweight.util.BTree;
import com.designPatterns.gangOfFour.structual.flyweight.util.Font;

// GlyphContext acts as a repository of extrinsic state. It maintains
// a compact mapping between a glyph and its font (and any other graphical
// attributes it might have) in different contexts. Any operation that
// needs to know the glyph's font in a given context will have a
// GlyphContext instance passed to it as a parameter. The operation can
// then query the GlyphContext for the font in that context. The context
// depends on the glyph's location in the glyph structure. Therefore
// Glyph's child iteration and manipulation operations must update the
// GlyphContext whenever they're used.
public class GlyphContext {
	
	private int index = 1;
	private	BTree fonts = new BTree();
	
	public void next(int step) {
		index += step;
	}
	public Font getFont() {
		return fonts.getFont(index);
	}
	public void setFont(Font font, int span) {
		fonts.setFont(font, span);
	}
	public int getIndex() {
		return index;
	}

}
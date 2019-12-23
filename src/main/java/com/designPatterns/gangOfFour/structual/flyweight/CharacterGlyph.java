package com.designPatterns.gangOfFour.structual.flyweight;

import com.designPatterns.gangOfFour.structual.flyweight.util.Font;
import com.designPatterns.gangOfFour.structual.flyweight.util.Window;

// ConcreteFlyweight - implements the Flyweight interface and adds storage
// for intrinsic state, if any. A ConcreteFlyweight object must be sharable.
// Any state it stores must be intrinsic; that is, it must be independent of
// the ConcreteFlyweight object's context.

// A flyweight is a shared object that can be used in multiple contexts
// simultaneously. Flyweights cannot make assumptions about the context
// in which they operate. The key concept here is the distinction between
// intrinsic and extrinsic state. Intrinsic state is stored in the flyweight;
// it consists of information that's independent of the flyweight's context,
// thereby making it sharable. Extrinsic state depends on and varies with the
// flyweight's context and therefore can't be shared. Client objects are
// responsible for passing extrinsic state to the flyweight when it needs it.
public class CharacterGlyph extends Glyph {
	
	// The character code is intrinsic state,
	// while the other information is extrinsic.
	private final char charcode;
	
	public CharacterGlyph(char charcode) {
		this.charcode = charcode;
	}
	
	@Override
	public void draw(Window window, GlyphContext glyphContext) {
		window.draw(this, glyphContext);
		glyphContext.next(getLength());
	}

	@Override
	public void setFont(Font font, GlyphContext glyphContext) {
		glyphContext.setFont(font, getLength());
	}

	@Override
	public Font getFont(GlyphContext glyphContext) {
		return glyphContext.getFont();
	}

	public char getCharcode() {
		return charcode;
	}

	@Override
	public int getLength() {
		return 1;
	}
	
}
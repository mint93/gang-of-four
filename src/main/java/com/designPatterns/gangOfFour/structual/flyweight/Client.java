package com.designPatterns.gangOfFour.structual.flyweight;

import com.designPatterns.gangOfFour.structual.flyweight.util.Font;
import com.designPatterns.gangOfFour.structual.flyweight.util.Window;

// Client - maintains a reference to flyweight(s),
// computes or stores the extrinsic state of flyweight(s).
public class Client {

	public static void main(String[] args) {
		GlyphContext glyphContext = new GlyphContext();
	    GlyphFactory glyphFactory = new GlyphFactory();
	    
	    Row row = generateRow("apparent", glyphFactory, glyphContext);
	    Column column = generateColum(row, glyphFactory);
	    
	    Window window = new Window();
	    column.draw(window, glyphContext);
	}

	private static Column generateColum(Row row, GlyphFactory glyphFactory) {
		Column column = glyphFactory.createColumn();
		column.insert(row);
		return column;
	}
	
	private static Row generateRow(String text, GlyphFactory glyphFactory, GlyphContext glyphContext) {
		Font times16 = new Font("Times-Roman-16");
	    Font times12 = new Font("Times-Roman-12");
	    
		Row row = glyphFactory.createRow();
	    char[] charArray = text.toCharArray();
	    for (int i = 0; i < charArray.length; i++) {
	    	CharacterGlyph characterGlyph = glyphFactory.createCharacter(charArray[i]);
	    	if (i == 0) {
	    		characterGlyph.setFont(times16, glyphContext);
	    	} else {
	    		characterGlyph.setFont(times12, glyphContext);
	    	}
	    	row.insert(characterGlyph);
		}
	    return row;
	}
}

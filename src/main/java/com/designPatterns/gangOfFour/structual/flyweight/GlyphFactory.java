package com.designPatterns.gangOfFour.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory - creates and manages flyweight objects,
// ensures that flyweights are shared properly. When a client
// requests a flyweight, the FlyweightFactory object supplies
// an existing instance or creates one, if none exists.
public class GlyphFactory {
	
	private Map<Character, CharacterGlyph> characters;
	
	public GlyphFactory() {
		characters = new HashMap<>();
	}
	
	public CharacterGlyph createCharacter(Character character) {
		if (characters.get(character) == null) {
			characters.put(character, new CharacterGlyph(character));
		}
		return characters.get(character);
	}
	public Row createRow() {
		return new Row();
	}
	public Column createColumn() {
		return new Column();
	}
	
}
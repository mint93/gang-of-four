package com.designPatterns.gangOfFour.structual.flyweight.util;

import java.util.ArrayList;
import java.util.List;

// Structure that stores the glyph-to-font mapping. Each node
// in the tree is labeled with the length of the string for
// which it gives font information.
public class BTree {
	
	private List<Node> nodes = new ArrayList<>();

	public Font getFont(int index) {
		int idx = 0;
		for (Node node : nodes) {
			idx += node.getLength();
			if (idx >= index) {
				return node.getFont();
			}
		}
		throw new RuntimeException("Font for index " + index + " not found");
	}

	public void setFont(Font font, int span) {
		nodes.add(new Node(span, font));
	}

}

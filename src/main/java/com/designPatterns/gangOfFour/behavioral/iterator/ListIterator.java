package com.designPatterns.gangOfFour.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.gangOfFour.behavioral.iterator.util.IteratorOutOfBoundsException;

public class ListIterator<T> implements Iterator<T> {
	
	// An iterator keeps track of its own traversal state. Therefore
	// you can have more than one traversal in progress at once.
	private	final List<T> list;
	private int current = 0;
	
	public ListIterator(final List<T> list) {
		this.list = new ArrayList<>(list);
	}
	
	@Override
	public void first() {
		current = 0;
	}
	@Override
	public void next() {
		current++;
	}
	@Override
	public boolean isDone() {
		return current >= list.size();
	}
	@Override
	public T currentItem() {
		if (isDone()) {
			throw new IteratorOutOfBoundsException();
		}
		return list.get(current);
	}
	
}
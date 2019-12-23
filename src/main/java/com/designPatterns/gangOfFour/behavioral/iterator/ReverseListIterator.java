package com.designPatterns.gangOfFour.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.gangOfFour.behavioral.iterator.util.IteratorOutOfBoundsException;

public class ReverseListIterator<T> implements Iterator<T> {
	
	private	final List<T> list;
	private int current = 0;
	
	public ReverseListIterator(final List<T> list) {
		this.list = new ArrayList<>(list);
		current = list.size() - 1;
	}
	
	@Override
	public void first() {
		current = list.size() - 1;
	}
	@Override
	public void next() {
		current--;
	}
	@Override
	public boolean isDone() {
		return current < 0;
	}
	@Override
	public T currentItem() {
		if (isDone()) {
			throw new IteratorOutOfBoundsException();
		}
		return list.get(current);
	}
	
}
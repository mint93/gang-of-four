package com.designPatterns.gangOfFour.behavioral.iterator;

import java.util.List;

// Internal iterators can encapsulate different kinds of iteration.
// For example, FilteringListTraverser encapsulates an iteration
// that processes only items that satisfy a test.
public abstract class FilteringListTraverser<T> {
	private ListIterator<T> iterator;
	
	public FilteringListTraverser(List<T> list) {
		
	}
	public boolean traverse() {
		boolean result = false;
		for (
			iterator.first();
			!iterator.isDone();
			iterator.next()
		) {
			if (testItem(iterator.currentItem())) {
				result = processItem(iterator.currentItem());
				if (result == false) {
					break;
				}
			}
		}
			return result;
	}
	protected abstract boolean processItem(T item);
	// This interface is the same as ListTraverser's except for an
	// added testItem function that defines the test. Subclasses
	// override	testItem to specify the test (or we can pass
	// anonymous function).
	protected abstract boolean testItem(T item);
	
}
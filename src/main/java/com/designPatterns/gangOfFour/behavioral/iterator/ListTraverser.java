package com.designPatterns.gangOfFour.behavioral.iterator;

import java.util.List;

// Internal or passive ListIterator

// The issue in this case is how to parameterize the iterator with
// the operation we want to perform on each element. There are at
// least two options: (1) Pass in a anonymous function or closure,
// or (2) rely on subclassing. In the first case, the iterator calls
// the operation passed to it at each point in the iteration. In the
// second case, the iterator calls an operation that a subclass
// overrides to enact specific behavior.

// Neither option is perfect. Often you want to accumulate state
// during the iteration, and functions aren't well-suited to that.
// Subclass provides us with a convenient place to store the
// accumulated state, but creating a subclass for every different
// traversal is more work.
public abstract class ListTraverser<T> {
	
	private	ListIterator<T> iterator;
	
	public ListTraverser(List<T> list) {
		this.iterator = new ListIterator<>(list);
	}
	public boolean traverse() {
		boolean result = false;
		for (
			iterator.first();
			!iterator.isDone();
			iterator.next()
		) {
			result = processItem(iterator.currentItem());
			if (result == false) {
				break;
			}
		}
		return result;
	}
	
	protected abstract boolean processItem(T item);
	
}
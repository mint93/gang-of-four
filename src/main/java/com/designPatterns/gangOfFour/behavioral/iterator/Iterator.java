package com.designPatterns.gangOfFour.behavioral.iterator;

// An aggregate object such as a list should give you a way to access
// its elements without exposing its internal structure. Moreover,
// you might want to traverse the list in different ways, depending
// on what you want to accomplish. But you probably don't want to
// bloat the List interface with operations for different traversals,
// even if you could anticipate the ones you will need. You might
// also need to have more than one traversal pending on the same list.

// The key idea in Iterator pattern is to take the responsibility for
// access and traversal out of the list object and put it into an
// iterator object. The Iterator class defines an interface for
// accessing the list's elements.
public interface Iterator<T> {
	// first initializes the current element to the first element
	public void first();
	// next advances the current element to the next element
	public void next();
	// isDone tests whether we've advanced beyond the last
	// element—that is, we're finished with the traversal
	public boolean isDone();
	// currentItem operation returns the current element in the list
	public T currentItem();
}
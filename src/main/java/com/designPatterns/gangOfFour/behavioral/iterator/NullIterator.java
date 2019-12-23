package com.designPatterns.gangOfFour.behavioral.iterator;

// NullIterator is a degenerate iterator that's helpful for handling
// boundary conditions. By definition, a NullIterator is always done
// with traversal; that is, its isDone operation always evaluates to
// true. NullIterator can make traversing tree-structured aggregates
// (like Composites) easier. At each point in the traversal, we ask
// the current element for an iterator for its children. Aggregate
// elements return a concrete iterator as usual. But leaf elements
// return an instance of NullIterator. That lets us implement
// traversal over the entire structure in a uniform way.
public class NullIterator<T> implements Iterator<T> {
	
	@Override
	public void first() {
	}
	@Override
	public void next() {
	}
	@Override
	public boolean isDone() {
		return true;
	}
	@Override
	public T currentItem() {
		return null;
	}
	
}
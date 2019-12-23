package com.designPatterns.gangOfFour.behavioral.iterator;

// We can introduce an ListInterface class to standardize the list
// interface for different list implementations. Different
// implementations become subclasses of ListInterface. 
public interface ListInterface<T> {

	// To enable1 polymorphic iteration, ListInterface defines
	// a factory method	createIterator, which subclasses override
	// to return their corresponding iterator:
	public Iterator<T> createIterator();
}

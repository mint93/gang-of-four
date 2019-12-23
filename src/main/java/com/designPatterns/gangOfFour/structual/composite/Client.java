package com.designPatterns.gangOfFour.structual.composite;

public class Client {
	
	public static void main(String[] args) {
		Chassis chassis = new Chassis("PC Chassis");
		Bus bus = new Bus("MCA Bus");
		bus.add(new Card("16Mbs Token Ring", 10, 5));
		chassis.add(bus);
		chassis.add(new FloppyDisk("3.Bin Floppy", 15, 10));
		System.out.println("Chassis net price is " + chassis.netPrice());
	}
	
}

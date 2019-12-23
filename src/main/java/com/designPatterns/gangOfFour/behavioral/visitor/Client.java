package com.designPatterns.gangOfFour.behavioral.visitor;

public class Client {

	public static void main(String[] args) {
		Chassis chassis = new Chassis("PC Chassis");
		Bus bus = new Bus("MCA Bus");
		bus.add(new Card("16Mbs Token Ring", 10, 8, 5));
		chassis.add(bus);
		chassis.add(new FloppyDisk("3.Bin Floppy", 15, 12, 10));
		
		InventoryVisitor inventoryVisitor = new InventoryVisitor();
		chassis.accept(inventoryVisitor);
		System.out.println(inventoryVisitor.getInventory());
		
		PricingVisitor pricingVisitor = new PricingVisitor();
		chassis.accept(pricingVisitor);
		System.out.println(pricingVisitor.getTotalPrice());
	}
}

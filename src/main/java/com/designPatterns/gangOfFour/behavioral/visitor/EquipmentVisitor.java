package com.designPatterns.gangOfFour.behavioral.visitor;

public interface EquipmentVisitor {
	public void visitFloppyDisk(FloppyDisk floppyDisk);
	public void visitCard(Card card);
	public void visitChassis(Chassis chassis);
	public void visitBus(Bus bus);
	// and so on for other concrete subclasses of Equipment
}
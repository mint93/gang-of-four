package com.designPatterns.gangOfFour.creational.factoryMethod;

import com.designPatterns.gangOfFour.creational.util.Door;
import com.designPatterns.gangOfFour.creational.util.DoorNeedingSpell;
import com.designPatterns.gangOfFour.creational.util.EnchantedRoom;
import com.designPatterns.gangOfFour.creational.util.MazeGame;
import com.designPatterns.gangOfFour.creational.util.Room;
import com.designPatterns.gangOfFour.creational.util.Spell;

public class EnchantedMazeGame extends MazeGame {
	@Override
	public Room makeRoom(int roomNumber) {
		return new EnchantedRoom(roomNumber, castSpell());
	}
	@Override
	public Door makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}
	
	protected Spell castSpell() {
		return new Spell();
	}
}
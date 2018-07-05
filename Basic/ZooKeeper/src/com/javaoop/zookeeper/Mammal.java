package com.javaoop.zookeeper;

public class Mammal {
	public int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy level is: " + energyLevel);
		return energyLevel;
	}
}

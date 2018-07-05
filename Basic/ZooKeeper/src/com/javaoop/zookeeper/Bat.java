package com.javaoop.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("whoosh, taking off");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("eating humans bwahaha");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("the town is falling...");
		energyLevel -= 100;
	}
}

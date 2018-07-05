package com.javaoop.zookeeper;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("Just threw something");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Just ate a banana, life is good");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Just climbed a tree, I'm tired");
		energyLevel -= 10;
	}
}

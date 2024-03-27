package com.objetctsmaster.race;

public class HumanTest {

	public static void main(String[] args) {
		
		Human Safiro = new Human();
		Human Juda = new Human();
		
		Safiro.attack(Juda);
		System.out.println(Juda.getHealth());	

	}

}

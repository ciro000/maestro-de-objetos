package com.objetctsmaster.race.types;
import com.objetctsmaster.race.Human;

public class Samurai extends Human{
	
	private static int numberOfSamurai = 0;
	
	public Samurai(){
		this.health = 200;
		numberOfSamurai++;
	}

	public static int getNumberOfSamurai() {
		return numberOfSamurai;
	}

	public static void setNumberOfSamurai(int numberOfSamurai) {
		Samurai.numberOfSamurai = numberOfSamurai;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = (this.health / 2);
		System.out.println("Humano ha sido asesinado");
	}
	
	public void meditate() {
		this.health += (this.health / 2);
		System.out.println("El samurai recuperó salud y ahora es " + this.health);
	}
	
	public static int howMany() {
		System.out.println("Hay " + numberOfSamurai + " samurais creados");
		return numberOfSamurai;
	}
	
}

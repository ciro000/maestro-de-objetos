package com.objetctsmaster.race.types;
import com.objetctsmaster.race.Human;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.health += this.intelligence;
		System.out.println("La salud del humano se recuperó y ahora es " + target.health);
	}
	
	public void fireBall(Human target) {
		target.health -= (this.intelligence * 3);
		System.out.println("La salud del humano bajó y ahora es " + target.health);
	}

}

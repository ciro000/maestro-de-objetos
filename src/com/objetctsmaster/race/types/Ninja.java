package com.objetctsmaster.race.types;
import com.objetctsmaster.race.Human;

public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human target) {
		target.health -= this.stealth;
		System.out.println(target + "perdió salud en " + this.stealth);
		this.health += this.stealth;
		System.out.println("La salud del ninja se icnrementó en " + this.stealth + "su salud ahora es" + this.health);
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("Ninja ha huido, ahora su salud es " + this.health);
	}

}

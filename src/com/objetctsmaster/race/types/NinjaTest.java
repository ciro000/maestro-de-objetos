package com.objetctsmaster.race.types;

public class NinjaTest {

	public static void main(String[] args) {
		Ninja pikachu = new Ninja();
		Ninja bulbasur = new Ninja();
		
		pikachu.steal(bulbasur);
		bulbasur.runAway();
		
		Wizard patolucas = new Wizard();
		Wizard mikimouse = new Wizard();
		
		mikimouse.fireBall(bulbasur);
		patolucas.heal(bulbasur);
		
		Samurai jack = new Samurai();
		Samurai champloo = new Samurai();
		Samurai x = new Samurai();
		
		jack.deathBlow(mikimouse);
		jack.meditate();
		
		int numSamurai = Samurai.howMany();
		System.out.println(numSamurai);
	}

}

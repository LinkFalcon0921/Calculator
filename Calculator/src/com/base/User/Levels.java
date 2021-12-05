package com.base.User;

public class Levels {

	
	private int level;
	private Levels adm;
	
	private Levels() {
			level = 1;
	}
	
	public Levels getAdmin() {
		if(adm == null) {
			adm = new Levels();
		}
		
		return adm;
	}
	//Aumenta el nivel 
	public int up() {
		return (level < 3)? ++level : level;
	}
	
	//Reduce el nivel
	public int down() {
		return (level > 2)? --level: level;
	}
	
	
	//Resetea el nivel
	public void reset() {
		level = 1;
	}

}

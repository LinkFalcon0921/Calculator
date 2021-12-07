package com.base.User;

import com.base.Interfaces.Uppers;

public class Levels implements Uppers{

	
	private int level;
	private static Levels adm;
	
	private Levels() {
			level = 1;
	}
	
	public static Levels getAdmin() {
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

	/**
	 * Cierra la clase.
	 */
	public int value() {
		return level;
	}

	@Override
	public void close() {
		adm = null;		
	}
}

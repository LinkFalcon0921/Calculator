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
	@Override
	public int up() {
		return (level < 11)? ++level : level;
	}

	//Reduce el nivel
	@Override
	public int down() {
		return (level > 2)? --level: level;
	}

	//Resetea el nivel
	@Override
	public void reset() {
		level = 1;
	}

	
	@Override
	public int value() {
		return level;
	}
	
	/**
	 * Cierra la clase.<br/>Debe cerrarse cada vez que Calculos cierre.
	 */
	@Override
	public void close() {
		try {
			adm = null;
		}catch(NullPointerException e) {
		
		}
	}
}
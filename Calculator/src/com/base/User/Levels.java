package com.base.User;

public class Levels {

	private static int level;
	private static Levels adm;

	private Levels() {
		level = 1;
	}

	// Static Singleton
	public static Levels getAdmin() {
		if (adm == null) {
			adm = new Levels();
		}

		return adm;
	}

	// Aumenta el nivel
	public int up() {
		return (level < 20) ? ++level : level;
	}

	// Reduce el nivel
	public int down() {
		return (level > 1) ? --level : level;
	}

	// Resetea el nivel
	public void reset() {
		level = 1;
	}

	// Obtener el nivel
	public int level() {
		return level;
	}

}

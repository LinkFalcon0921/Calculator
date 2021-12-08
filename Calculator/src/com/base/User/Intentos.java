package com.base.User;

import com.base.Interfaces.Uppers;

public class Intentos implements Uppers{

	private static int trys;
	private static Intentos adm;

	private Intentos() {
		trys = 3;
	}

	public static Intentos getAdmin() {
		if(adm == null) {
			adm = new Intentos();
		}
		return adm;
	}

	//Sube los intentos
	@Override
	public int up() {
		return (trys < 3) ? ++trys : trys;
	}

	// Reduce los intentos
	@Override
	public int down() {
		return (trys > 0) ? --trys : trys;
	}

	// Resetea los intentos
	@Override
	public void reset() {
		trys = 1;
	}

	// Obtener el valor
	@Override
	public int value() {
		return trys;
	}

	/**
	 * Cierra la clase.
	 */
	@Override
	public void close() {
		adm = null;
	}

}

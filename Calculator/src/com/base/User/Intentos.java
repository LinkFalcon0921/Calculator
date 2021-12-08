package com.base.User;

import com.base.Interfaces.Uppers;

public class Intentos implements Uppers{

	private static int trys, countUp;
	private static Intentos adm;

	private Intentos() {
		trys = 3;
		countUp = 0;
	}

	public static Intentos getAdmin() {
		if(adm == null) {
			adm = new Intentos();
		}
		return adm;
	}

	//Sube los intentos si logra 3 correctas en consecutivo.
	@Override
	public int up() {
		if(countUp++ == 3)
			return (trys < 3) ? ++trys : trys;
		
		return trys;
	}

	// Reduce los intentos
	@Override
	public int down() {
		countUp = 0;
		//(trys > 0)
		return (trys > countUp) ? --trys : trys;
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
		try {
			adm = null;
		}catch(NullPointerException e) {
		
		}
	}

}

package com.base.Actions;

import java.util.Random;

public class CalculosLevels {
	private static CalculosLevels adm;

	private CalculosLevels() {

	}

	public static CalculosLevels getAdmin() {

		if(adm == null) {
			adm = new CalculosLevels();
		}

		return adm;
	}

	/**
	 * Obtienes el valor aleatorio basado en el nivel para obtener la operacion.
	 */
	public int levelOperation(int lv) {

		int t = (lv % 4) + 1;
		int level = new Random().nextInt(t) + 1;

		return level;
	}

	/**
	 * Cierra la instancia.<br/>Debe hacerse en todo proceso de la clase Calculos
	 * sea cerrada.
	 */
	public void close() {
		try {
			adm = null;
		}catch(NullPointerException e) {
			
		}
	}

}

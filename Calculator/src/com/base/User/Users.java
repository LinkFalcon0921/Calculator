package com.base.User;

import com.base.Actions.Calculos;

public class Users {

	private Calculos values;

	public Users() {
		values = new Calculos();
	}
	
	
	/**
	 *  Valida el valor introducido por el usuario.
	 *  <br/><br/>
	 *  Crea una nueva operacion. 
	 *  
	 *  @param resultUser : Variable introducida por el usuario.
	 */
	public boolean Validate(int resultUser) {
		return values.validate(resultUser);
	}
	
	/**
	 *  Valida el valor introducido por el usuario.
	 *	<br/><br/>
	 *  Crea una nueva operacion. 
	 *  
	 *  @param resultUser : Variable introducida por el usuario.
	 */
	public boolean Validate(double resultUser) {
		return values.validate(resultUser);
	}

	/** 
	 * Metodo que asigna los valores en los contenedores respectivos para cada elemento.
	 * <br/><br/>
	 * La clase contenedora debe de tener los sigientes contenedores de texto (Asignar un nombre): 
	 *  @param level : Nivel del usuario actual.
	 *  @param Mayor valor : Primer valor (antes del signo). 
	 *  @param Signo : Signo de la operacion
	 *  @param Mayor valor : Primer valor (despues del signo).
	 * */
	public void setSpaces() {
		 
	}
}

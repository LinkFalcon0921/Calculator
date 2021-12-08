package com.base.Actions;

import com.base.Actions.helpers.OpersGetter;
import com.base.Interfaces.OpersDoubles;
import com.base.User.Intentos;
import com.base.User.Levels;

/**
Clase encargade de mantener contacto con la fachada principal y las variables de operacion.
*/
public class Calculos {
	// Variables de la clase a uso de Fachada.
	private OpersDoubles operation;
	private int pointer;

	public Calculos() {

	}

	/**
	 * Metodo generador de operaciones por nivel.<br/>
	 * <br/>
	 * Toma el nivel del usuario actual para poder seleccionar el siguiente operador
	 * de clase.<br/>
	 * <br/>
	 * En caso de que requiera cambiar el puntero solo remplaza las variables dentro
	 * de la clase.
	 *
	 */
	public void createOperation() {

		int level = CalculosLevels.getAdmin().levelOperation(Levels.getAdmin().value());

		if (!equalsPointer(level)) {

			operation = OpersGetter.Create(level);
			operation.replace(Levels.getAdmin().value());
			pointer = level;

		} else {

			operation.replace(Levels.getAdmin().value() * 10);

		}

	}

	/**
	 * Metodo validador de operaciones. Valida si fue correcto el resultado del
	 * usuario ante la operacion.
	 */
	public boolean validate(double result) {
		if(operation.getResultDouble().doubleValue() == result) {
			createOperation();
			return true;
		}else {
			Intentos.getAdmin().down();
		}

		return false;
	}

	/**
	 * Metodo validador de operaciones. Valida si fue correcto el resultado del
	 * usuario ante la operacion.
	 * @param result : Valor ingresado por el usuario.
	 */
	public boolean validate(int result) {
		if(operation.getResultInt() == result) {
			createOperation();
			return true;
		}else {
			Intentos.getAdmin().down();
			System.out.println("Entro!");
		}

		return false;
	}

	/**
	 * Verificar si es el mismo operador vasado en el nivel aplicado.
	 *
	 * @param lv : nivel de operacion.
	 */
	private boolean equalsPointer(int lv) {
		return pointer == lv;
	}

	/**
	 *
	 * Devuelve la operacion con sus valores:
	 * <br/><br/>
	 * Valores principales, signo relacionado y su resultado.
	 */
	public OpersDoubles getOperation() {
		return operation;
	}

}
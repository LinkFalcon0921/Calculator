package com.base.Interfaces;

import java.util.Random;

public abstract class OpersDoubles {
	/*
	 * Valor en orden : A mayor , bmenor e resultado.
	 */
	protected double A, B, Result;

	protected OpersDoubles() {
		A = B = Result = 0;
	}

	/**
	 * Aplica los valores de reemplazo de variables.
	 */
	protected void setValues(int oper) {
		Random p = new Random();
		int resource = oper + oper / 10;
		// Aplica valores aleatorios a las variables principales.
		// Asigna valores aleatorios basados en el nivel introducido.
		A = (p.nextDouble() * resource) + 1;
		B = (p.nextDouble() * resource) + 1;

		chase();
	}

	/**
	 * Verifica si debe cambiar de lugar las variables.
	 */
	private void chase() {

		if (A < B) {
			double inter = 0;

			inter = A;
			A = B;
			B = inter;
		}
	}

	/**
	 * Metodo a llamar publicamente para generar los valores de la clase.
	 */
	public abstract void replace(int oper);

	/**
	 * Obtener el primer valor de la operacion.
	 */
	public Double getValA() {
		return A;
	}

	/**
	 * Obtener el segundo valor de la operacion.
	 */
	public Double getValB() {
		return B;
	}

	/**
	 * Obtener el resultado de la operacion.
	 */
	public Double getResult() {
		return Result;
	}
}

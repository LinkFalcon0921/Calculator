package com.base.Interfaces;

import java.util.Random;

public abstract class OpersDoubles {
	// Valor en orden : mayor , menor e resultado.
	protected double A, B, Result;

	protected OpersDoubles() {
		A = B = Result = 0;
	}

	// Aplica los valores de reemplazo de variables.
	protected void setValues(int oper) {
		Random p = new Random();
		int resource = oper + oper / 10;
		// Aplica valores aleatorios a las variables principales.
		// Asigna valores aleatorios basados en el nivel introducido.
		A = p.nextDouble() * resource + resource;
		B = p.nextDouble() * resource + resource;

		chase();
	}

	// Vrifica si debe cambiar de lugar las variables
	private void chase() {

		if (A < B) {
			double inter = 0;

			inter = A;
			A = B;
			B = inter;
		}
	}

	// Metodo a llamar publicamente para generar los valores de la clase.
	public abstract void replace(int oper);

	// Obtener el primer valor
	public Double getValA() {
		return A;
	}

	// Obtener el segundo valor
	public Double getValB() {
		return B;
	}

	// Obtener el resultado
	public Double getResult() {
		return Result;
	}
}

package com.base.Interfaces;

import java.util.Random;

import com.base.Actions.helpers.Sign;

public abstract class OpersDoubles {
	/*
	 * Valor en orden : A mayor , B menor y RESULT resultado.
	 */
	// Valor en orden : mayor , menor e resultado.
	protected double A, B, Result;
	protected Sign signo;
	
	protected OpersDoubles() {
		A = B = Result = 0;
	}

	// Aplica los valores de reemplazo de variables.
	protected void setValues(int oper) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				Random p = new Random();
				int resource = oper + oper / 10;
				// Aplica valores aleatorios a las variables principales.
				// Asigna valores aleatorios basados en el nivel introducido.
				A = (p.nextDouble() * resource) + 1;
				B = (p.nextDouble() * resource) + 1;
				
				A = Math.round(A * 100.0) / 100.0;
				B = Math.round(B * 100.0) / 100.0;
				
				chase();
			}
		}).start();
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
	
	/**
	 *  Obtiene la valor del signo en valor int.<br/> Este valor int se puede pasar a char para obtener si valor ASCII. 
	 */
	public int getSign() {
		return signo.getName();
	}
}

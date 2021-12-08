package com.base.Actions.helpers;

public enum Sign {
	SUM(43),
	MINUS(45),
	MULTIPLY(158),
	DIVIDE(246);

	private int oper;

	Sign(int val) {
		oper = val;
	}

	/**
	 *Devuelve le valor numerico del signo.
	 */
	public int getNum() {
		return oper;
	}

	/**
	 *  Devuelve el nombre del signo.
	 */
	public String getName() {
		return toString();
	}

}

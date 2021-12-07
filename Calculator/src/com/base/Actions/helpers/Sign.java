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

	public int getName() {
		return oper;
	}
	
}

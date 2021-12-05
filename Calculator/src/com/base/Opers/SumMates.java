package com.base.Opers;

import com.base.Interfaces.OpersDoubles;

//Clase Suma : Operacion de suma.
public class SumMates extends OpersDoubles {

	
	public SumMates() {
		super();
	}

	@Override
	public void replace(int oper) {
		setValues(oper);
		
		Result = A + B;
	}

}

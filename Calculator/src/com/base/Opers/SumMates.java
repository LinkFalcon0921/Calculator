package com.base.Opers;

import com.base.Actions.helpers.Sign;
import com.base.Interfaces.OpersDoubles;

//Clase Suma : Operacion de suma.
public class SumMates extends OpersDoubles {


	public SumMates() {
		super();
		signo = Sign.SUM;
	}

	@Override
	public void replace(int oper) {
		setValues(oper);

		Result = A + B;
	}

}

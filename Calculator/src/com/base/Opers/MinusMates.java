package com.base.Opers;

import com.base.Actions.helpers.Sign;
import com.base.Interfaces.OpersDoubles;

public class MinusMates extends OpersDoubles {

		public MinusMates() {
			super();
			signo = Sign.MINUS;
		}

		//Reajusta los valores de la clase.
		@Override
		public void replace(int oper) {
			setValues(oper);

			Result = A - B;

		}



}

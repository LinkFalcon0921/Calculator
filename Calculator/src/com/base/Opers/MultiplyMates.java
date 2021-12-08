package com.base.Opers;

import com.base.Actions.helpers.Sign;
import com.base.Interfaces.OpersDoubles;

public class MultiplyMates extends OpersDoubles {

		public MultiplyMates() {
			super();
			signo = Sign.MULTIPLY;
		}

		@Override
		public void replace(int oper) {
			setValues(oper);

			Result = A * B;
		}

}

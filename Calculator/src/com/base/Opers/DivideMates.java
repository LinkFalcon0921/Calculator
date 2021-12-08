package com.base.Opers;

import com.base.Actions.helpers.Sign;
import com.base.Interfaces.OpersDoubles;

public class DivideMates extends OpersDoubles {

		public DivideMates() {
			super();
			signo = Sign.DIVIDE;
		}

		@Override
		public void replace(int oper) {
			setValues(oper);

			Result = A / B;
		}

}

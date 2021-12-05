package com.base.Opers;

import com.base.Interfaces.OpersDoubles;

public class DivideMates extends OpersDoubles {

		public DivideMates() {
			super();
		}

		@Override
		public void replace(int oper) {
			setValues(oper);
			
			Result = A / B;
		}

}

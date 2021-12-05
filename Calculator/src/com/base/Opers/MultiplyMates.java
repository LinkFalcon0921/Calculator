package com.base.Opers;

import com.base.Interfaces.OpersDoubles;

public class MultiplyMates extends OpersDoubles {
	
		public MultiplyMates() {
			super();
		}

		@Override
		public void replace(int oper) {
			setValues(oper);
			
			Result = A * B;
		}

}

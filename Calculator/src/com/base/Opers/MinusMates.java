package com.base.Opers;

import com.base.Interfaces.OpersDoubles;

public class MinusMates extends OpersDoubles {
		
		public MinusMates() {
			super();
		}

		//Reajusta los valores de la clase.
		@Override
		public void replace(int oper) {
			setValues(oper);
			
			Result = A - B;
			
		}
	


}

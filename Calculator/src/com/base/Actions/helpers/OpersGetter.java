package com.base.Actions.helpers;

import com.base.Interfaces.OpersDoubles;
import com.base.Opers.DivideMates;
import com.base.Opers.MinusMates;
import com.base.Opers.MultiplyMates;
import com.base.Opers.SumMates;

public class OpersGetter {


	//Toma el nuvel del otorgado para crear un nuevo operados de calculos
	//Luego sera enviado por el sistema.
	public static OpersDoubles Create(int levels) {

		OpersDoubles obj = null;

		switch(levels) {
			case 1:
				obj = new SumMates();
				break;

			case 2:
				obj = new MinusMates();
				break;

			case 3:
				obj = new MultiplyMates();
				break;

			case 4:
				obj = new DivideMates();
				break;


				default:
					//settable
					break;
		}

		return obj;
	}

}

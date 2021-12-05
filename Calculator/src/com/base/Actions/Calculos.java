package com.base.Actions;

import com.base.Actions.helpers.OpersGetter;
import com.base.Interfaces.OpersDoubles;

/*
Clase encargade d emantener contacto con la fachada principal y las variables e operacion. 
*/
public class Calculos {
	//Variables de la clase a uso de Fachada.
	private OpersDoubles operation; 
	
	
	public Calculos() {
		
	}

	public void create(int levels) {
		operation = OpersGetter.Create(levels);
	}
	
}
package com.base.User;

import com.base.Actions.Calculos;
import com.base.GUI.panels.POperation;
import com.base.Interfaces.OpersDoubles;

/**
 * Fachada encargada de todo el proceso del usuario durante toda la aplicacion de calculador.
 */
public class Users {

	//Variables de clase privada.
	private String nameUser;
	private Calculos values;

	public Users(String nameUser) {
		values = new Calculos();
	}

	/**
	 * Genera nuevo operacion
	 */
	public void CreateOperation() {
		values.createOperation();
	}
	
	/**
	 *  Valida el valor introducido por el usuario.
	 *  <br/><br/>
	 *  Crea una nueva operacion. 
	 *  
	 *  @param resultUser : Variable introducida por el usuario.
	 */
	public boolean Validate(int resultUser) {
		return values.validate(resultUser);
	}
	
	/**
	 *  Valida el valor introducido por el usuario.
	 *	<br/><br/>
	 *  Crea una nueva operacion. 
	 *  
	 *  @param resultUser : Variable introducida por el usuario.
	 */
	public boolean Validate(double resultUser) {
		return values.validate(resultUser);
	}

	/** 
	 * Metodo que asigna los valores en los contenedores respectivos para cada elemento.
	 * <br/><br/>
	 * La clase contenedora debe de tener los sigientes contenedores de texto (Asignar un nombre):
	 * <br/>
	 * Se realiza de manera asincronica. 
	 *  @param level : Nivel del usuario actual.
	 *  @param mayor valor : Primer valor (antes del signo). 
	 *  @param menor valor : Segundo valor (despues del signo).
	 * */
	public void setSpaces(POperation panel) {
		
		new Thread(new Runnable() {
			public void run() {
				OpersDoubles value = values.getOperation();
				String lv = String.valueOf(Levels.getAdmin().value());
				String ty = String.valueOf(Intentos.getAdmin().value());
				com.base.GUI.panels.PActions actions = panel.getActionsPane(); 
				
				
				//Crear nueva sintesis basada en clase Operacion
				
				panel.getLevel().setText(lv);
				//Arreglar crear clase trys.
				panel.getTrys().setText(ty);
				
				actions.setLabelA(value.getValA().toString());
				actions.setLabelB(value.getValB().toString());
			
			}
		}).start();
				
	}
	
	public boolean close() {
		
		if(Intentos.getAdmin().value() == 0) {
			Intentos.getAdmin().close();
			Levels.getAdmin().close();
			values = null;
			return true;
		}
		
		return false;
		
	}
}

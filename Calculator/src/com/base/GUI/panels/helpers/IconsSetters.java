package com.base.GUI.panels.helpers;

import java.io.File;
import javax.swing.*;
import com.base.Actions.helpers.Sign;

public class IconsSetters {
	
	private static IconsSetters adm;
	private String imageSite;
	
	private IconsSetters() {
		imageSite = new File("com\\base\\Images\\").getAbsolutePath();
	}
	
	public static IconsSetters getAdmin() {
		
		if(adm == null) {
			adm = new IconsSetters();
		}
		
		return adm;
	}

	/**
	 * Asigna el icono a la etiqueta.
	 * @param icon : Nombre de signo.
	 */
	public Icon setIcon(Sign icon) {
		Icon op = new ImageIcon(imageSite.concat("\\".concat(icon.getName()).concat(".png")));
		System.out.println(imageSite.concat("\\".concat(icon.getName()).concat(".png")));
		
		return op;
	}
	
}
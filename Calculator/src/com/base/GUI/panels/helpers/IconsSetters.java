package com.base.GUI.panels.helpers;

import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.base.Actions.helpers.Sign;

public class IconsSetters {

	private static IconsSetters adm;
	private String imageSite;

	private IconsSetters() {
		//Buscar mejor forma de buscar carpetas.
		imageSite = new File("src\\com\\base\\Imagenes").getAbsolutePath();
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
		String iconi = imageSite.concat("\\".concat(icon.getName()).concat(".png"));
		Icon op = new ImageIcon(iconi);

		return op;
	}

}

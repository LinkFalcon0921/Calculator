package com.base.GUI.panels.helpers;

import java.awt.event.*;
import javax.swing.JLabel;

import com.base.GUI.BaseApp;
import com.base.GUI.panels.POperation;

import java.awt.Color;

/**
 * Clase encargada de manejar todas la accion de implementacion. Toma y verifica
 * la informacion ingresada por el usuario.<br/>
 * 
 */
public class ActionKeyPressed implements KeyListener {

	private JLabel rs;
	private BaseApp bases;

	public ActionKeyPressed(POperation text) {

	}

	public ActionKeyPressed(BaseApp base) {

		bases = base;

		bases.getUsers().setSpaces(bases.getOpers());
	}

	/**
	 * Boton presionado asigna el valor introducido por el usuario.<br/>
	 * <br/>
	 * El valor debe ser un numero.
	 */
	@Override
	public void keyPressed(KeyEvent e) {

		if (rs == null) {
			rs = bases.getOpers().getActionsPane().getLabelRS();
		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			// Verifica el valor de resultado.
			Double val = Double.valueOf(rs.getText());

			if (val.doubleValue() % val.intValue() == 0) {
				wrColor(val.doubleValue());
			} else {
				wrColor(val.intValue());
			}

			// Cierra si fallaste
			if (bases.getUsers().close()) {
				bases.close();
			} else {
				bases.getUsers().setSpaces(bases.getOpers());
			}
			
		} else if (Character.isDigit(e.getKeyChar())) {
			addText(e.getKeyChar());
		} else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			delText();
		}

	}
	//Color basado en las equivocaciones
	private void wrColor(double val) {
		if (!bases.getUsers().Validate(val)) {
			rs.setOpaque(true);
			rs.setBackground(Color.RED);
			rs.setForeground(Color.WHITE);
		} else {
			rs.setText("0");
		}

	}
	//Color basado en las equivocaciones
	private void wrColor(int val) {
		if (!bases.getUsers().Validate(val)) {
			rs.setOpaque(true);
			rs.setBackground(Color.RED);
			rs.setForeground(Color.WHITE);
		} else {
			rs.setText("0");
		}
	}
	//Color basado en las equivocaciones
	private void chColor() {
		if (rs.getBackground() == Color.RED) {
			rs.setBackground(Color.white);
			rs.setForeground(Color.BLACK);
			rs.setOpaque(false);
		}
	}

	
	//Agregar valor al texto
	private void addText(char val) {
		// Asigna el valor en el label.
		String value = String.valueOf(val);

		// Si no contiene nada
		if (rs.getText().equals("0")) {
			rs.setText(value);
		}
		// Si ya tiene algo
		else {
			rs.setText(rs.getText().concat(value));
		}

		/*
		 * Cambia el color
		 */
		chColor();
	}

	private void delText() {

		if (rs.getText().length() == 1) {
			rs.setText("0");
		} else {
			rs.setText(rs.getText().substring(0, rs.getText().length() - 1));
		}
		chColor();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}

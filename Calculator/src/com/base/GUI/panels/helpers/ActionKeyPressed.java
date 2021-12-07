package com.base.GUI.panels.helpers;

import java.awt.event.*;
import javax.swing.JLabel;

import com.base.GUI.panels.POperation;

import java.awt.Color;

/**
*	Clase encargada de manejar todas la accion de implementacion.
* Toma y verifica la informacion ingresada por el usuario.<br/>
*	
*/
public class ActionKeyPressed implements KeyListener {
	
	private POperation comp;
	private com.base.User.Users admin;
	private JLabel rs;

	public ActionKeyPressed(POperation text) {
		comp = text;
	}
	
	public ActionKeyPressed(com.base.User.Users hl,POperation text) {
		admin = hl;
		comp = text;
	}
	
	/**
	 * Boton presionado asigna el valor introducido por el usuario.<br/><br/>
	 * El valor debe ser un numero.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(rs==null) {
			rs = comp.getActionsPane().getLabelRS();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			//Verifica el valor de resultado.
			Double val = Double.valueOf(rs.getText());
			
			if(val.doubleValue() % val.intValue() == 0) {
				wrColor(val.doubleValue());
			}else {
				wrColor(val.intValue());
			}
		
		}
		else if(Character.isDigit(e.getKeyChar())) {
			addText(e.getKeyChar());
		}
		else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			delText();
		}
	
    }
	
	public boolean getState() {
		return admin.close();
	}
	
	private void wrColor(double val) {
		if(!admin.Validate(val)) {
			rs.setOpaque(true);
			rs.setBackground(Color.RED);
			rs.setForeground(Color.WHITE);
		}else {
			rs.setText("0");
		}
		
	}
	
	private void chColor() {
		if(rs.getBackground() == Color.RED) {
			rs.setBackground(Color.white);
			rs.setForeground(Color.BLACK);
			rs.setOpaque(false);
		}	
	}
	
	private void wrColor(int val) {
		if(!admin.Validate(val)) {
			rs.setOpaque(true);
			rs.setBackground(Color.RED);
			rs.setForeground(Color.WHITE);
		}else {
			rs.setText("0");
		}
	}

	private void addText(char val) {
		//Asigna el valor en el label.
		String value = String.valueOf(val);
		
		//Si no contiene nada
		if(rs.getText().equals("0")) {
			rs.setText(value);
		}
		//Si ya tiene algo
		else {
			rs.setText(rs.getText().concat(value));
		}
		
		/*
		 * Cambia el color
		 */
		chColor();
	}

	private void delText() {
		
		if(rs.getText().length() == 1) {
			rs.setText("0");
		}else {
			rs.setText(rs.getText().substring(0,rs.getText().length()-1));
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

package com.base.GUI.panels;

import javax.swing.*;
import com.base.GUI.Stablos;

public class POperation extends JPanel {
	
	//variables de accion privada.
	private JLabel labelLV, labelTY;
	private PActions actions;
	
	/**
	 * Create the panel.
	 * Ingrese el metodo del usuario.
	 */
	public POperation(com.base.User.Users l) {
		setElements(l);
	}
	
	//Metodo iniciador de design simple.
	private void init() {
		setBounds(200,200,800,600);
		setBackground(Stablos.BASEBACKGROUND);
		Title();
		setLayout(null);
		
	}
	
	//Agregar elementos adicionales
	private void setElements(com.base.User.Users l) {
		//Propiedad de los objetos
		init();
		TextLevel();
		TextTry();
		
		//Agregar JPanel de accion
		actions = new PActions(l,this);
		add(actions);
	}
	
	//Medodos getters JLABELS
	public JLabel getLevel() {
		return labelLV;
	}
	
	public JLabel getTrys() {
		return labelTY;
	}
	
	public PActions getActionsPane() {
		return actions;
	}

	
	private void TextLevel() {
		//Texto para niveles
		JLabel label = new JLabel();
		
		label.setBounds(57,160,70,70);
		
		label.setText("Niveles");
		label.setFont(Stablos.FUENTETITLE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(label);
		
		
		//Texto variables
		labelLV = new JLabel();
		
		labelLV.setBounds(label.getX(),200,label.getWidth(),label.getHeight());
		
		labelLV.setText("00");
		labelLV.setFont(Stablos.FUENTENORMALVARIABLES);
		labelLV.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(labelLV);

	}
	
	private void TextTry() {
		//Texto para Intentos
			JLabel label = new JLabel();
				
			label.setBounds(this.getWidth() - 167,160,100,70);
				
			label.setText("Intentos");
			label.setFont(Stablos.FUENTETITLE);				
			label.setHorizontalAlignment(labelLV.getHorizontalAlignment());
				
			add(label);	
			
			//Texto variable
			labelTY = new JLabel();
			
			labelTY.setBounds( label.getX() + 2 ,200,label.getWidth(),label.getHeight());
			
			labelTY.setText("00");
			labelTY.setFont(Stablos.FUENTENORMALVARIABLES);
			labelTY.setHorizontalAlignment(SwingConstants.CENTER);
			
			add(labelTY);
	}
	
	private void Title() {
		JLabel label = new JLabel("User");
		
		label.setBounds(60,40,getWidth() - 140,80);
		label.setFont(Stablos.FUENTEBIGTITLE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(label);		
	}
	
}

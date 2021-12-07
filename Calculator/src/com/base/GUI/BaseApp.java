package com.base.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.base.GUI.panels.PActions;
import com.base.GUI.panels.POperation;
import com.base.User.Users;

import java.awt.Window.Type;

public class BaseApp {

	private JFrame framebase;
	private Users actions;
	private POperation basePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseApp window = new BaseApp();
					window.framebase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BaseApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framebase = new JFrame();
		framebase.setTitle("My_app_set_tittle_flintcore");
		framebase.setBounds(330, 200, 810, 575);
		framebase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		actions = new Users("");
		actions.CreateOperation();
		basePanel = new POperation(actions);
		
		framebase.add(basePanel);
		
		setSpaces();
	}
	
	private void setSpaces() {
		
		actions.setSpaces(basePanel);
		
	}

}

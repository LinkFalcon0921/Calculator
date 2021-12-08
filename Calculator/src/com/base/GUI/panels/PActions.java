package com.base.GUI.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.base.GUI.BaseApp;
import com.base.GUI.Stablos;
import com.base.GUI.panels.helpers.ActionKeyPressed;

public class PActions extends JPanel {

	/**
	 * Serial value
	 */
	private static final long serialVersionUID = 1L;
	//Variables de asignacion de User
	private JLabel MY, SY, MN , RS;
	private JSeparator separator;
	private GridBagConstraints gbc_separator;

	//Bounds
	private int X = 238 ,Y = 188;
	private int W = 300 ,H = 240;


	/* Obtener el Elemento en el JPanel */

	/**
	 * Referencia al label superior
	 */
	public String getLabelA() {
		return MY.getText();
	}
	/**
	 * Referencia al label inferior.
	 */
	public String getLabelB() {
		return MN.getText();
	}
	/**
	 * Referencia al label del signo.
	 */
	private JLabel getLabelSign() {
		return SY;
	}
	/**
	 * Referencia al label de resultado.
	 */
	public JLabel getLabelRS() {
		return RS;
	}

	/**
	 * Texto del label superior.
	 * @param val : valor a asignar.
	 */
	public void setLabelA(String val) {
		MY.setText(val);
	}

	/**
	 * Texto del label inferior.
	 * @param val : valor a asignar.
	 */
	public void setLabelB(String val) {
		MN.setText(val);
	}

	/**
	 * Texto del label superior.
	 * @param val : valor a asignar.
	 */
	public void setLabelA(int val) {
		MY.setText(String.valueOf(val));
	}

	/**
	 * Texto del label inferior.
	 * @param val : valor a asignar.
	 */
	public void setLabelB(int val) {
		MN.setText(String.valueOf(val));
	}

	/**
	 * Icono relacionado a la operacion.
	 * @param icon icono a asignar.
	 */
	public void setLabelSY(Icon icon) {
		if(icon == null)
		getLabelSign().setText("");

		getLabelSign().setIcon(icon);
	}
	/**
	 * Texto del label resultado.
	 * @param val : valor a asignar.
	 */

	/**
	 * Create the panel.
	 */
	public PActions() {
		init();
	}

	//Metodo asignador base
	private void init() {

		setBounds(X,Y,W,H);
		setFocusable(true);
		//setBackground();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 169, 10, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		//Separador base de elementos
		separator = new JSeparator();
		separator.setBounds(new Rectangle(0, 0, 3, 40));

		//LAYOUT
		gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 6;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 8;
		add(separator, gbc_separator);

		//TEXTOS
			setTextM();
			SetTextN();
			setTextS();
			SetTextR();

		}

	//Agrega el label A en el panel.
	private void setTextM() {

		//Variable mayor
			MY = new JLabel("00");
			MY.setOpaque(true);
			MY.setFont(Stablos.FUENTEGIANTTITLE);
			MY.setOpaque(false);
			MY.setHorizontalAlignment(SwingConstants.RIGHT);

			GridBagConstraints gbc_MY = new GridBagConstraints();
			gbc_MY.fill = GridBagConstraints.BOTH;
			gbc_MY.gridwidth = 2;
			gbc_MY.gridheight = 4;
			gbc_MY.insets = new Insets(0, 0, 5, 5);
			gbc_MY.gridx = 3;
			gbc_MY.gridy = 0;
			add(MY, gbc_MY);

	}
	//Agrega el label B en el panel
	private void SetTextN() {

	//Variable menor
			MN = new JLabel("00");
			MN.setOpaque(true);
			MN.setFont(Stablos.FUENTEGIANTTITLE);
			MN.setHorizontalAlignment(SwingConstants.RIGHT);
			MN.setOpaque(false);

			GridBagConstraints gbc_MN = new GridBagConstraints();
			gbc_MN.insets = new Insets(0, 0, 5, 5);
			gbc_MN.fill = GridBagConstraints.BOTH;
			gbc_MN.gridheight = 4;
			gbc_MN.gridx = 4;
			gbc_MN.gridy = 4;
			add(MN, gbc_MN);

	}

	//AGREGA el valr signo por icono al panel.
	private void setTextS() {

		//Icono signo
		SY = new JLabel("O");
		SY.setOpaque(true);
		SY.setFont(Stablos.FUENTEGIANTTITLE);
		SY.setHorizontalAlignment(SwingConstants.CENTER);
		SY.setOpaque(false);

		GridBagConstraints GBC_SY = new GridBagConstraints();
		GBC_SY.fill = GridBagConstraints.BOTH;
		GBC_SY.gridwidth = 4;
		GBC_SY.gridheight = 3;
		GBC_SY.insets = new Insets(5, 5, 5, 5);
		GBC_SY.gridx = 0;
		GBC_SY.gridy = 5;
		add(SY, GBC_SY);

	}

	//AGREGA EL RESULTADO al panel.
	private void SetTextR() {

		//Variable Resultado
		RS = new JLabel("0");
		RS.setFont(Stablos.FUENTEGIANTTITLE);
		RS.setHorizontalAlignment(SwingConstants.RIGHT);
		RS.setOpaque(false);

		GridBagConstraints gbc_RS = new GridBagConstraints();
		gbc_RS.insets = new Insets(0, 0, 0, 5);
		gbc_RS.fill = GridBagConstraints.BOTH;
		gbc_RS.gridheight = 3;
		gbc_RS.gridwidth = 2;
		gbc_RS.gridx = 3;
		gbc_RS.gridy = 9;

		add(RS, gbc_RS);

	}

	/**
	 * Agrega el listener a la clase panel Actions.
	 *
	 * @param parent : Panel que captura el panel.
	 */
	public void addListenerRS(BaseApp parent) {
		this.addKeyListener( new ActionKeyPressed(parent));
	}


}

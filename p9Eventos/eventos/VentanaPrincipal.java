/**
 * Ventana.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 30 mar. 2017
 *
 */
package eventos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {
	final static int MAX_WIDTH = 400;
	final static int MAX_HEIGHT = 400;
	private JButton up = new JButton("Up");
	private JButton left = new JButton("Left");
	private JButton right = new JButton("Right");
	private JButton down = new JButton("Down");
	
    
	public VentanaPrincipal(JuegoPanel juego){
		
		setSize(MAX_WIDTH, MAX_HEIGHT);
		setLayout(new GridLayout(2,1));

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void añadirBotones(){
		JPanel panelabajo = new JPanel();
		GridBagLayout gridbag = new GridBagLayout();
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    panelabajo.setLayout(gridbag);
	    gbc.weightx = 0.5;
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    panelabajo.add(getUp(),gbc);
	    gbc.weightx = 0.5;
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    panelabajo.add(getDown(),gbc);
	    gbc.weightx = 0.5;
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    panelabajo.add(getLeft(),gbc);
	    gbc.weightx = 0.5;
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    panelabajo.add(getRight(),gbc);
	    
	    add(panelabajo);
		
	}

	/**
	 * Getter de up
	 * @return the up
	 */
	public JButton getUp() {
		return up;
	}

	/**
	 * Setter de up
	 * @param up the up to set
	 */
	public void setUp(JButton up) {
		this.up = up;
	}

	/**
	 * Getter de left
	 * @return the left
	 */
	public JButton getLeft() {
		return left;
	}

	/**
	 * Setter de left
	 * @param left the left to set
	 */
	public void setLeft(JButton left) {
		this.left = left;
	}

	/**
	 * Getter de right
	 * @return the right
	 */
	public JButton getRight() {
		return right;
	}

	/**
	 * Setter de right
	 * @param right the right to set
	 */
	public void setRight(JButton right) {
		this.right = right;
	}

	/**
	 * Getter de down
	 * @return the down
	 */
	public JButton getDown() {
		return down;
	}

	/**
	 * Setter de down
	 * @param down the down to set
	 */
	public void setDown(JButton down) {
		this.down = down;
	}
	
	

}

package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private static int MAX_WIDTH = 300;
	private static int MAX_HEIGHT = 500; 
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, MAX_WIDTH, MAX_HEIGHT);
		setLayout(new GridLayout(4,1));
		setTitle("Conversor Moneda");
		
	}

}

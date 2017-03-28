package graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private Cuadratica funcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Ventana frame = new Ventana();
					
					
				} 
		
	

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Funcion Cuadratica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLayout(new BorderLayout());
		
		funcion = new Cuadratica();
		add(funcion,BorderLayout.CENTER);
		setVisible(true);
	}

}

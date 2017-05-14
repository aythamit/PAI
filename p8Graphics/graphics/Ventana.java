package graphics;

import java.awt.BorderLayout;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private Cuadratica funcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					@SuppressWarnings("unused")
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

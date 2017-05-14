/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 6 - Guis
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p6FundamentosInterfacesGraficas.toHTML;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class VentanaHTML extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaHTML frame = new VentanaHTML();
					@SuppressWarnings("unused")
					ToHtml a = new ToHtml(args[0],args[1]);
					@SuppressWarnings("unused")
					JLabel prueba = new JLabel("prueba");
					@SuppressWarnings("unused")
					String ax = "holaa que tal";
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaHTML() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

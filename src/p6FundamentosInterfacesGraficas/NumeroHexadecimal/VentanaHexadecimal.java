package p6FundamentosInterfacesGraficas.NumeroHexadecimal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaHexadecimal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

				try {
					VentanaHexadecimal frame = new VentanaHexadecimal();
					System.out.println();
					JLabel num = new JLabel("El numero " + args[0] + " en decimal es: " +Hexadecimal.hex2decimal(args[0]).toString());
					num.setForeground(Color.BLUE);
					frame.add(num);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			

	}

	/**
	 * Create the frame.
	 */
	public VentanaHexadecimal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

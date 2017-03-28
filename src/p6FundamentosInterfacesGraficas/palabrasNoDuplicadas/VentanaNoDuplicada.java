package p6FundamentosInterfacesGraficas.palabrasNoDuplicadas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import p6FundamentosInterfacesGraficas.AdivinaUnNumero.PanelAdivina;

public class VentanaNoDuplicada extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		
			
				try {
					TreeMap<String, Integer> tree;
					NoDuplicadas a = new NoDuplicadas(args[0]);
					tree = a.getTmapInverse();
					VentanaNoDuplicada frame = new VentanaNoDuplicada();
					frame.setSize(400, 30*tree.size());
					JLabel reverse = new JLabel("");
					for (Entry<String, Integer> entry : tree.entrySet())
				        reverse.setText(reverse.getText() + " " + (String)entry.getKey() + "\n");
					frame.add(reverse);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
	}

	/**
	 * Create the frame.
	 */
	public VentanaNoDuplicada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

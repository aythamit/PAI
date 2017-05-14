package caminoAleatorio;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;


@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {

	private static final int LCUADRADO = 20;
	private static final int CELDAS = 20;
	private PanelJuego juego;
	private PanelBotones panel;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		panel = new PanelBotones();
		setTitle("CaminoAleatorio");
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		juego = new PanelJuego(LCUADRADO,CELDAS);
		
		
		
		
		JPanel x = new JPanel();
		x.setLayout(new BoxLayout(x, BoxLayout.PAGE_AXIS));
		x.add(juego);
		
		add(x, BorderLayout.CENTER);
		
		panel.aniadirFuncion(getJuego());
		add(panel, BorderLayout.EAST);
		
		setSize(juego.getWidth() + 150, juego.getHeight() + 100);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
					
					
					
	}

	/**
	 * Getter de juego
	 * @return the juego
	 */
	public PanelJuego getJuego() {
		return juego;
	}

	/**
	 * Setter de juego
	 * @param juego the juego to set
	 */
	public void setJuego(PanelJuego juego) {
		this.juego = juego;
	}

	/**
	 * Getter de panel
	 * @return the panel
	 */
	public PanelBotones getPanel() {
		return panel;
	}

	/**
	 * Setter de panel
	 * @param panel the panel to set
	 */
	public void setPanel(PanelBotones panel) {
		this.panel = panel;
	}
}

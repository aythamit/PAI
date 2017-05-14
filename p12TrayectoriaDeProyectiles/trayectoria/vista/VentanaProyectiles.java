/**
 * VentanaProyectiles.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 27 abr. 2017
 *
 */
package trayectoria.vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import trayectoria.controlador.ControladoraBotones;


public class VentanaProyectiles extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final int FRAME_WIDTH = 1024;
	public static final int FRAME_HEIGTH = 768;

	PanelProyectil panelArriba;
	PanelBotones panelAbajo;
	ControladoraBotones botonController;

	/**
	 * Create the frame.
	 */
	public VentanaProyectiles() {
		
		setTitle("Trayectoria de Proyectiles");
		setSize(FRAME_WIDTH, FRAME_HEIGTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		setLayout(new BorderLayout());
		setPanelArriba(new PanelProyectil());
		setPanelAbajo(new PanelBotones());
		
		add(getPanelArriba() , BorderLayout.CENTER);
		add(getPanelAbajo(), BorderLayout.SOUTH);
		
		setBotonController(new ControladoraBotones(getPanelArriba(), getPanelAbajo()));

	}

	/**
	 * Getter de panelArriba
	 * @return the panelArriba
	 */
	public PanelProyectil getPanelArriba() {
		return panelArriba;
	}

	/**
	 * Setter de panelArriba
	 * @param panelArriba the panelArriba to set
	 */
	public void setPanelArriba(PanelProyectil panelArriba) {
		this.panelArriba = panelArriba;
	}

	/**
	 * Getter de panelAbajo
	 * @return the panelAbajo
	 */
	public PanelBotones getPanelAbajo() {
		return panelAbajo;
	}

	/**
	 * Setter de panelAbajo
	 * @param panelAbajo the panelAbajo to set
	 */
	public void setPanelAbajo(PanelBotones panelAbajo) {
		this.panelAbajo = panelAbajo;
	}

	/**
	 * Getter de botonController
	 * @return the botonController
	 */
	public ControladoraBotones getBotonController() {
		return botonController;
	}

	/**
	 * Setter de botonController
	 * @param botonController the botonController to set
	 */
	public void setBotonController(ControladoraBotones botonController) {
		this.botonController = botonController;
	}

}

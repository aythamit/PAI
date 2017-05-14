/**
 * TrayectoriaProyectiles.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 27 abr. 2017
 *
 */
package trayectoria.controlador;

import java.awt.EventQueue;

import trayectoria.vista.VentanaProyectiles;

public class TrayectoriaProyectiles {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					VentanaProyectiles frame = new VentanaProyectiles();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

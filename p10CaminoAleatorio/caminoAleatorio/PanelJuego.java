package caminoAleatorio;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * PanelJuego.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 14 abr. 2017
 *
 */

@SuppressWarnings("serial")
public class PanelJuego extends JPanel{
	
	private int nCeldas;
	private Snake serpiente;
	private int lcuad;
	public PanelJuego(int alto, int ancho, int nCeldas){
		
		setSize(ancho, ancho);
		setnCeldas(nCeldas);
		//
		//setBackground(Color.CYAN);
		//setConstante(ancho / getnCeldas());
		//System.out.println(getWidth() + " " + getHeight());
	}
	
	public PanelJuego(int lcuadrado, int celdas){
		setSize((lcuadrado * celdas), (lcuadrado * celdas));
		lcuad = lcuadrado;
		setnCeldas(celdas);
		serpiente = new Snake((celdas/2) * getLcuad(), getLcuad(), getnCeldas());
	}

	
	public void paint(Graphics g){
		super.paint(g);
		pintaCuadricula(g);
		
		getSerpiente().paint(g);
		
	}


	private void pintaCuadricula(Graphics g) {
		g.setColor(Color.BLACK);
		
		for(int i = 0; i < getnCeldas(); i++)
			for(int j = 0; j < getnCeldas(); j++)
				g.drawRect(i * lcuad , j * lcuad, lcuad, lcuad);
		
	}


	/**
	 * Getter de nCeldas
	 * @return the nCeldas
	 */
	public int getnCeldas() {
		return nCeldas;
	}


	/**
	 * Setter de nCeldas
	 * @param nCeldas the nCeldas to set
	 */
	public void setnCeldas(int nCeldas) {
		this.nCeldas = nCeldas;
	}


	/**
	 * Getter de serpiente
	 * @return the serpiente
	 */
	public Snake getSerpiente() {
		return serpiente;
	}


	/**
	 * Setter de serpiente
	 * @param serpiente the serpiente to set
	 */
	public void setSerpiente(Snake serpiente) {
		this.serpiente = serpiente;
	}

	/**
	 * Getter de lcuad
	 * @return the lcuad
	 */
	public int getLcuad() {
		return lcuad;
	}

	/**
	 * Setter de lcuad
	 * @param lcuad the lcuad to set
	 */
	public void setLcuad(int lcuad) {
		this.lcuad = lcuad;
	}

}

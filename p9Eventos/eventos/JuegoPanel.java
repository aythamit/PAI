/**
 * JuegoPanel.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 29 mar. 2017
 *
 */
package eventos;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JuegoPanel extends JPanel {
	
	Pelota ball ;
	private int ancho;
	private int alto;
	public JuegoPanel(int width, int height, int acelera) {
		ancho = width;
		alto = height;
		setSize(ancho, alto);
		ball = new Pelota(this, acelera);
		setBackground(Color.CYAN);
		
		setBorder(BorderFactory.createLineBorder(Color.black)); 
		
	}
	/**
	 * Getter de ancho
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * Setter de ancho
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * Getter de alto
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * Setter de alto
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**
	 * Getter de ball
	 * @return the ball
	 */
	public Pelota getBall() {
		return ball;
	}
	/**
	 * Setter de ball
	 * @param ball the ball to set
	 */
	public void setBall(Pelota ball) {
		this.ball = ball;
	}
	public void moveBall(int dir){
		ball.moveArriba(dir);
	}
	public void paint(Graphics g){
		super.paint(g);
		
		ball.paint(g);
		
	}

}

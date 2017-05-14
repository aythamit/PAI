/**
 * Pelota.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 29 mar. 2017
 *
 */
package eventos;

import java.awt.Graphics;

public class Pelota {
	private int maxAncho;
	private int maxAlto;
	private int x;
	private int y;
	private int aceleracion;
	private int tamaño;
	
	/**
	 * Constructor de la clase Pelota
	 * @param acelera 
	 * @param x
	 * @param y
	 */
	public Pelota(JuegoPanel p, int acelera) {
		setTamaño(30);
		setAceleracion(acelera);
		setMaxAncho(p.getAncho());
		setMaxAlto(p.getAlto());
		setX(getMaxAncho() / 2);
		setY(getMaxAlto() / 2);
		
		
	}		
	public void moveArriba(int dir){
		switch(dir){
			case 0:{
				if(getY() - getAceleracion() > 0)
					setY(getY() - getAceleracion());
			}break;
			case 1:{
				if(getY() + getAceleracion() < getMaxAlto() - (getTamaño() * 2) + getTamaño() / 3 )
					setY(getY() + getAceleracion());
			}break;
			case 2:{
				if(getX() - getAceleracion() > 0){
					setX(getX() - getAceleracion());
				}
			}break;
			case 3:{
				if(getX() + getAceleracion() < getMaxAncho() - (getTamaño() * 2) + (getTamaño() / 3))
					setX(getX() + getAceleracion());
			}break;
			
		}
		
		
	}
	
	public void paint(Graphics g) {
		g.fillOval(getX(), getY(), 30, 30);
		
	}
	/**
	 * Getter de x
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * Setter de x
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Getter de y
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * Setter de y
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Getter de maxAncho
	 * @return the maxAncho
	 */
	public int getMaxAncho() {
		return maxAncho;
	}

	/**
	 * Setter de maxAncho
	 * @param maxAncho the maxAncho to set
	 */
	public void setMaxAncho(int maxAncho) {
		this.maxAncho = maxAncho;
	}

	/**
	 * Getter de maxAlto
	 * @return the maxAlto
	 */
	public int getMaxAlto() {
		return maxAlto;
	}

	/**
	 * Setter de maxAlto
	 * @param maxAlto the maxAlto to set
	 */
	public void setMaxAlto(int maxAlto) {
		this.maxAlto = maxAlto;
	}

	/**
	 * Getter de aceleracion
	 * @return the aceleracion
	 */
	public int getAceleracion() {
		return aceleracion;
	}

	/**
	 * Setter de aceleracion
	 * @param aceleracion the aceleracion to set
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}

	/**
	 * Getter de tamaño
	 * @return the tamaño
	 */
	public int getTamaño() {
		return tamaño;
	}

	/**
	 * Setter de tamaño
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

}

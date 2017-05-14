/**
 * Snake.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 14 abr. 2017
 *
 */
package caminoAleatorio;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Snake {
	
	private final int ARRIBA = 0;
	private final int DERECHA= 1;
	private final int ABAJO = 2;
	private final int IZQUIERDA = 3;
	
	private int x;
	private int y;
	private int distanciaMov;
	private int nCeldas;
	private Color color;
	private ArrayList<Trazo> traza;
	
	/**
	 * Constructor de la clase Snake
	 * @param x
	 * @param y
	 * @param distanciaMov
	 */
	public Snake(int pos, int distanciaMov , int nCeldas) {
		setDistanciaMov(distanciaMov);
		setX(pos);
		setY(pos);
		setnCeldas(nCeldas);
		traza = new ArrayList<Trazo>();
		setColor(Color.RED);
		getTraza().add(new Trazo(getX() , getY(), getX(), getY()));
	}
	
	public boolean isBorde(){
		int borde = getnCeldas() * getDistanciaMov();
		if(getX() == 0 || getY() == 0 || getX() == borde || getY() == borde)
			return true;
		
		return false;
	}
	public void moveAleatorio(){
		
		int move = (int) (Math.random() * 4);
		switch(move){
			case ARRIBA :{
				//getTraza().add(new Trazo(getX() , getY(), getX(), getY() - getDistanciaMov()));
				getTraza().add(new Trazo(getX() , getY(), getX(), getY() - getDistanciaMov(), getColor()));
				setY(getY() - getDistanciaMov());
			}break;
			case DERECHA :{
				//getTraza().add(new Trazo(getX() , getY(), getX() + getDistanciaMov() , getY()));
				getTraza().add(new Trazo(getX() , getY(), getX() + getDistanciaMov() , getY(), getColor()));
				setX( getX() + getDistanciaMov());
			}break;
			case ABAJO :{
				//getTraza().add(new Trazo(getX() , getY(), getX(), getY() + getDistanciaMov()));
				getTraza().add(new Trazo(getX() , getY(), getX(), getY() + getDistanciaMov(), getColor()));
				setY(getY() + getDistanciaMov());
			}break;
			case IZQUIERDA :{
				//getTraza().add(new Trazo(getX() , getY(), getX() - getDistanciaMov() , getY()));
				getTraza().add(new Trazo(getX() , getY(), getX() - getDistanciaMov() , getY(), getColor()));
				setX( getX() - getDistanciaMov());
				
			}break;
		}
			
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(4));
		
		for(Trazo it : getTraza()){
			g2.setColor(it.getColor());
			g2.drawLine(it.getxAct() , it.getyAct() , it.getxPost(), it.getyPost());
		}
			
		
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
	 * Getter de distanciaMov
	 * @return the distanciaMov
	 */
	public int getDistanciaMov() {
		return distanciaMov;
	}
	/**
	 * Setter de distanciaMov
	 * @param distanciaMov the distanciaMov to set
	 */
	public void setDistanciaMov(int distanciaMov) {
		this.distanciaMov = distanciaMov;
	}

	/**
	 * Getter de traza
	 * @return the traza
	 */
	public ArrayList<Trazo> getTraza() {
		return traza;
	}

	/**
	 * Setter de traza
	 * @param traza the traza to set
	 */
	public void setTraza(ArrayList<Trazo> traza) {
		this.traza = traza;
	}

	/**
	 * Getter de color
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Setter de color
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
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


	
	

}

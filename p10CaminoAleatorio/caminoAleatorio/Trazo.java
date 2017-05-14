/**
 * Trazo.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 17 abr. 2017
 *
 */
package caminoAleatorio;

import java.awt.Color;

public class Trazo {
	
	private int xAct;
	private int yAct;
	private int xPost;
	private int yPost;
	private Color color;
	
	/**
	 * Constructor de la clase Trazo
	 * @param xAct
	 * @param yAct
	 * @param xPost
	 * @param yPost
	 */
	public Trazo(int xAct, int yAct, int xPost, int yPost) {
		setxAct(xAct);
		setyAct(yAct);
		setxPost(xPost);
		setyPost(yPost);
	}
	public Trazo(int xAct, int yAct, int xPost, int yPost, Color color) {
		setxAct(xAct);
		setyAct(yAct);
		setxPost(xPost);
		setyPost(yPost);
		setColor(color);
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
	 * Getter de xAct
	 * @return the xAct
	 */
	public int getxAct() {
		return xAct;
	}
	/**
	 * Setter de xAct
	 * @param xAct the xAct to set
	 */
	public void setxAct(int xAct) {
		this.xAct = xAct;
	}
	/**
	 * Getter de yAct
	 * @return the yAct
	 */
	public int getyAct() {
		return yAct;
	}
	/**
	 * Setter de yAct
	 * @param yAct the yAct to set
	 */
	public void setyAct(int yAct) {
		this.yAct = yAct;
	}
	/**
	 * Getter de xPost
	 * @return the xPost
	 */
	public int getxPost() {
		return xPost;
	}
	/**
	 * Setter de xPost
	 * @param xPost the xPost to set
	 */
	public void setxPost(int xPost) {
		this.xPost = xPost;
	}
	/**
	 * Getter de yPost
	 * @return the yPost
	 */
	public int getyPost() {
		return yPost;
	}
	/**
	 * Setter de yPost
	 * @param yPost the yPost to set
	 */
	public void setyPost(int yPost) {
		this.yPost = yPost;
	}


}

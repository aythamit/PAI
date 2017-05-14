/**
 * Parabola.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 28 abr. 2017
 *
 */
package trayectoria.modelo;

import java.awt.Color;
import java.util.ArrayList;

public class Parabola {
	
	final static double GRAVEDAD = 9.8;
	
	private double tiempo;
	private double velocidad;
	private double grados;
	private double altura;
	private double velocidadX;
	private double velocidadY;
	private ArrayList<Punto> puntos;
	private Color color;
	
	public Parabola(int vel, int gr, int inicio){
		setVelocidad(vel);
		setGrados(calculaRadianes(gr));
		setAltura(inicio);
		setTiempo(0);
		setPuntos(new ArrayList<Punto>());
		setVelocidadX(calculaVelocidadX());
		setVelocidadY(calculaVelocidadY());
		setColor(colorAleatorio());
		
		calculoParabola();
	}


	/**
	 * @return
	 */
	private Color colorAleatorio() {
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		return new Color(red, green, blue);
	}


	/**
	 * @return
	 */
	private double calculaRadianes(int grados) {
		
		return (grados * (Math.PI / 180));
	}
	
	/**
	 * @return
	 */
	private double calculaVelocidadX() {
		
		return (getVelocidad() * Math.cos(getGrados()));
	}
	
	/**
	 * @return
	 */
	private double calculaVelocidadY() {
		
		return (getVelocidad() * Math.sin(getGrados()));
	}
	/**
	 * 
	 */
	private void calculoParabola() {
		double px = 0;
		double py = 5;
		while(py > 0){
			px = calculoX(getTiempo());
			py = calculoY(getTiempo());
			getPuntos().add(new Punto((int)px , (int)py));
			setTiempo(getTiempo() + 0.2);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = "Parabola: ";
		
		for(Punto it : getPuntos()){
			str+= "( " + it.getX() + " , " + it.getY() + " ) \n";
		}
		return str;
	}


	/**
	 * 
	 */
	private double calculoX(double tiempo) {
		// x = x0 + vx * t
		double x = getVelocidadX() * tiempo;
		return x;
	}
	
	private double calculoY(double tiempo) {
		// y = H + v0y·t - 1/2 · g · t2
		double y = getAltura() + (getVelocidadY()* tiempo) - (0.5 * GRAVEDAD * Math.pow(tiempo, 2));
		if(y <= 0){
			return 0;
		}
		return y;
	}

	/**
	 * Getter de velocidad
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}

	/**
	 * Setter de velocidad
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Getter de grados
	 * @return the grados
	 */
	public double getGrados() {
		return grados;
	}

	/**
	 * Setter de grados
	 * @param d the grados to set
	 */
	public void setGrados(double d) {
		this.grados = d;
	}

	/**
	 * Getter de inicio
	 * @return the inicio
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Setter de inicio
	 * @param inicio the inicio to set
	 */
	public void setAltura(int inicio) {
		this.altura = inicio;
	}

	/**
	 * Getter de puntos
	 * @return the puntos
	 */
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}

	/**
	 * Setter de puntos
	 * @param puntos the puntos to set
	 */
	public void setPuntos(ArrayList<Punto> puntos) {
		this.puntos = puntos;
	}

	/**
	 * Getter de velocidadX
	 * @return the velocidadX
	 */
	public double getVelocidadX() {
		return velocidadX;
	}

	/**
	 * Setter de velocidadX
	 * @param velocidadX the velocidadX to set
	 */
	public void setVelocidadX(double velocidadX) {
		this.velocidadX = velocidadX;
	}

	/**
	 * Getter de velocidadY
	 * @return the velocidadY
	 */
	public double getVelocidadY() {
		return velocidadY;
	}

	/**
	 * Setter de velocidadY
	 * @param velocidadY the velocidadY to set
	 */
	public void setVelocidadY(double velocidadY) {
		this.velocidadY = velocidadY;
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
	 * Setter de velocidad
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	/**
	 * Setter de altura
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getTiempo() {
		return tiempo;
	}


	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

}

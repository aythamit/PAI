/**
 * Cuadratica.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 22 mar. 2017
 *
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Cuadratica extends DibujaFuncionAbstracta{
	

	/**
	 * Constructor de la clase Cuadratica
	 */
	public Cuadratica() {
		super();
	}
	
	@Override
	public double f(double x) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	protected void paintComponent ( Graphics g ) {
		super.paintComponent(g);
		for(double i = 0; i<20;i++){
			double y = Math.pow(i, 2);
			double xp = i+1;
			double yp = Math.pow(xp, 2);
			g.setColor(Color.black);
			g.drawLine(coordX((int)i),coordX((int)y),coordX((int)xp),coordX((int)yp));
			g.drawLine(coordX((int)-i),coordX((int)y),coordX((int)-xp),coordX((int)yp));
			System.out.println("X: " + i + " Y: " + y + " XP: " + xp + " YP: " + yp);
		}
	}
	
	public int coordX(int x){
		return getWidth()/2 - x;
	}
	public int coordY(int y){
		return getWidth()/2 - y;
	}
}

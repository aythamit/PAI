/**
 * a.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 22 mar. 2017
 *
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

@SuppressWarnings("serial")
abstract class DibujaFuncionAbstracta extends JPanel {
private static final int LEFT = 0;
private static final int RIGTH = 0;
private static final int A_EJE_Y = 0;
private static final int A_EJE_X = 0;
/** Polıgono para almacenar los puntos */
	
	private Polygon pol = new Polygon ( );

	protected DibujaFuncionAbstracta ( ) {
		dibujaFuncion ( ) ;
	}
/** Devuelve la coordenada Y del punto */
	public abstract double f ( double x ) ;

/** Obtiene ordenadas para las abcisas x en [LEFT , RIGHT] */
	public void dibujaFuncion ( ) {
		for( int x = LEFT ; x <= RIGTH ; x++) {
		
		pol.addPoint ( x + A_EJE_Y , (A_EJE_X - (int)f( x )) ) ;
		}
	}
/** Implementar para dibujar los ejes , etiquetas y la funci´on*/
	protected void paintComponent ( Graphics g ) {
	// Implementar
		g.setColor(Color.RED);
		g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
		g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
	}
}

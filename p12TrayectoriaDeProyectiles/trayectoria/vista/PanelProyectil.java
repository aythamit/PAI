/**
 * PanelProyectil.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 28 abr. 2017
 *
 */
package trayectoria.vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import trayectoria.modelo.Parabola;
import trayectoria.modelo.Punto;

public class PanelProyectil extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public static final int PANEL_WIDTH = VentanaProyectiles.FRAME_WIDTH;
	public static final int PANEL_HEIGTH = VentanaProyectiles.FRAME_HEIGTH - 200;
	private static final int MARGENX = 50;
	private static final int MARGENY = PANEL_HEIGTH - 50;
	private static final int CONSTALTURA = 50;
	private static final int LINEADIVISORIA = 100;
	
	private static final int INICIOVELOCIDADESX = 800;
	private static final int INICIOVELOCIDADESY = 80;
	private static final int MARGENVELOCIDADESY = 20;
	private ArrayList<Parabola> parabolas;
	private boolean mostrarRastro;
	private boolean mostrarVelocidades;
	private boolean mostrarVector;
	
	public PanelProyectil(){
		setSize(PANEL_WIDTH , PANEL_HEIGTH );
		setBackground(Color.WHITE);
		setParabolas(new ArrayList<Parabola>());
		setMostrarRastro(false);
		setMostrarVelocidades(false);
		setMostrarVector(false);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		pintaEje(g2);
		
		if(isMostrarRastro())
			pintaParabolas(g2);
		if(isMostrarVelocidades())
			pintaVelocidades(g2);
	}
	/**
	 * @param g2
	 */
	private void pintaVelocidades(Graphics2D g) {
		g.setColor(Color.BLACK);
		if(!getParabolas().isEmpty()){
			Parabola ultima = getParabolas().get(getParabolas().size() - 1);
			g.drawString("t = " + ultima.getTiempo()  + " s", INICIOVELOCIDADESX, INICIOVELOCIDADESY);
			g.drawString("x = " + ultima.getPuntos().get(ultima.getPuntos().size() - 1).getX()  + " m", INICIOVELOCIDADESX, INICIOVELOCIDADESY + MARGENVELOCIDADESY);
			g.drawString("y = " + ultima.getPuntos().get(ultima.getPuntos().size() - 1).getY()  + " m", INICIOVELOCIDADESX, INICIOVELOCIDADESY + MARGENVELOCIDADESY * 2);
			g.drawString("Vx = " + ultima.getVelocidadX()  + " m/s", INICIOVELOCIDADESX, INICIOVELOCIDADESY  + MARGENVELOCIDADESY * 3);
			g.drawString("Vy = " + ultima.getVelocidadY()  + " m/s", INICIOVELOCIDADESX, INICIOVELOCIDADESY + MARGENVELOCIDADESY * 4);
			g.drawString("V = " + ultima.getVelocidad()  + " m/s", INICIOVELOCIDADESX, INICIOVELOCIDADESY + MARGENVELOCIDADESY * 5);
			g.drawString("Vy = " + ultima.getVelocidadY()  + " s", INICIOVELOCIDADESX, INICIOVELOCIDADESY + MARGENVELOCIDADESY * 6);
		}
		
	}

	/**
	 * @param g
	 */
	private void pintaEje(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setStroke(new BasicStroke(2));
		g.setColor(Color.BLACK);

		g.drawLine(MARGENX, MARGENY, PANEL_WIDTH - CONSTALTURA, MARGENY); // LineaHorizontal
		g.drawLine(MARGENX, CONSTALTURA , MARGENX, MARGENY); // LineaVertical
		
		g.setStroke(new BasicStroke(1));
		int contador = 0;
		for(int i = MARGENY; i > CONSTALTURA; i -= 10){
			if(contador % LINEADIVISORIA == 0){
				g.setColor(Color.RED);
				g.drawLine(MARGENX, i, MARGENX - 15, i);
				g.drawString("" + contador, MARGENX - 40, i + 5);
			}else{
				g.setColor(Color.BLACK);
				g.drawLine(MARGENX, i, MARGENX - 10, i);
			}
			contador = contador + 10;
		}
		contador = 0;
		
		for(int i = MARGENX; i < PANEL_WIDTH - CONSTALTURA; i += 10){
			if(contador % 100 == 0){
				g.setColor(Color.RED);
				g.drawLine(i, MARGENY, i, MARGENY + 15);
				g.drawString("" + contador, i - 10, MARGENY + 30);
			}else{
				g.setColor(Color.BLACK);
				g.drawLine(i, MARGENY, i, MARGENY + 10);
			}
			contador = contador + 10;
		}
	}

	/**
	 * @param g
	 */
	private void pintaParabolas(Graphics2D g) {
		g.setStroke(new BasicStroke(3));
		for(Parabola itP : getParabolas()){
			g.setColor(itP.getColor());
			for(Punto itPuntos : itP.getPuntos()){
				g.drawLine(itPuntos.getX() + MARGENX , MARGENY - itPuntos.getY(), itPuntos.getX() + MARGENX , MARGENY - itPuntos.getY());
			}
		}
		
	}

	/**
	 * Getter de parabolas
	 * @return the parabolas
	 */
	public ArrayList<Parabola> getParabolas() {
		return parabolas;
	}

	/**
	 * Setter de parabolas
	 * @param parabolas the parabolas to set
	 */
	public void setParabolas(ArrayList<Parabola> parabolas) {
		this.parabolas = parabolas;
	}

	/**
	 * Getter de mostrarRastro
	 * @return the mostrarRastro
	 */
	public boolean isMostrarRastro() {
		return mostrarRastro;
	}

	/**
	 * Setter de mostrarRastro
	 * @param mostrarRastro the mostrarRastro to set
	 */
	public void setMostrarRastro(boolean mostrarRastro) {
		this.mostrarRastro = mostrarRastro;
	}

	/**
	 * Getter de mostrarVelocidades
	 * @return the mostrarVelocidades
	 */
	public boolean isMostrarVelocidades() {
		return mostrarVelocidades;
	}

	/**
	 * Setter de mostrarVelocidades
	 * @param mostrarVelocidades the mostrarVelocidades to set
	 */
	public void setMostrarVelocidades(boolean mostrarVelocidades) {
		this.mostrarVelocidades = mostrarVelocidades;
	}

	/**
	 * Getter de mostrarVector
	 * @return the mostrarVector
	 */
	public boolean isMostrarVector() {
		return mostrarVector;
	}

	/**
	 * Setter de mostrarVector
	 * @param mostrarVector the mostrarVector to set
	 */
	public void setMostrarVector(boolean mostrarVector) {
		this.mostrarVector = mostrarVector;
	}

}

/**
 * QuickHullPanel.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 24 abr. 2017
 *
 */
package quickHull;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class QuickHullPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final int RADIO = 5;
	
	
	private boolean drawLines;
	private List<Punto> puntos;
	private List<Punto> allPuntos;


	public QuickHullPanel(){
		setPuntos(new LinkedList<Punto>());
		setAllPuntos(new LinkedList<Punto>());
		setSize(QuickHullFrame.PANEL_HEIGTH,QuickHullFrame.PANEL_WIDTH);
		setBackground(Color.WHITE);

		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(int i = 0; i < getPuntos().size() ; i++){
			
			Punto p1 = getPuntos().get(i);
			
			g.fillOval(p1.getX(), p1.getY(), RADIO, RADIO);
			
			if(drawLines){
				Punto p2 = getPuntos().get( (i + 1) % getPuntos().size());
				g.setColor(Color.gray);
				g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
			}
		
		
		}
		
		for(int i = 0; i < getAllPuntos().size(); i++){
			g.setColor(Color.BLUE);
			Punto p = getAllPuntos().get(i);
			g.fillOval(p.getX(), p.getY(), RADIO, RADIO);
		
		}		
	}
	
	public void addPoint(Punto p) {
		getPuntos().add(p);
		this.drawLines = false;
		repaint();
	}
	
	public void addPoints(Collection<Punto> p) {
		getPuntos().addAll(p);
		this.drawLines = false;
		repaint();
	}
	
	public void savePoints(Collection<Punto> p) {
		getAllPuntos().clear();
		getAllPuntos().addAll(p);
		repaint();
	}
	
	public void clearPoints() {
		getPuntos().clear();
		this.drawLines = false;
		super.repaint();
		repaint();
	}
	
	
	public void drawLines() {
		this.drawLines = true;
	}
	
	
	/**
	 * Getter de puntos
	 * @return the puntos
	 */
	public List<Punto> getPuntos() {
		return puntos;
	}


	/**
	 * Setter de puntos
	 * @param linkedList the puntos to set
	 */
	public void setPuntos(LinkedList<Punto> linkedList) {
		this.puntos = linkedList;
	}

	/**
	 * Getter de allPuntos
	 * @return the allPuntos
	 */
	public List<Punto> getAllPuntos() {
		return allPuntos;
	}

	/**
	 * Setter de allPuntos
	 * @param allPuntos the allPuntos to set
	 */
	public void setAllPuntos(List<Punto> allPuntos) {
		this.allPuntos = allPuntos;
	}


}

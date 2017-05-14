/**
 * Listener.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 30 mar. 2017
 *
 */
package eventos;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class Listener implements MouseListener {
	JButton listenUp;
	JButton listenDown;
	JButton listedLeft;
	JButton listenRight;
	JuegoPanel juego;
	boolean pressed = false;
	Listener(JButton botonarriba, JButton botonabajo, JButton botonizquierda, JButton botonderecha, JuegoPanel juego){
		setListenUp(botonarriba);
		setListenDown(botonabajo);
		setListedLeft(botonizquierda);
		setListenRight(botonderecha);
		this.juego = juego;
	}

	/**
	 * Getter de listenUp
	 * @return the listenUp
	 */
	public JButton getListenUp() {
		return listenUp;
	}

	/**
	 * Setter de listenUp
	 * @param listenUp the listenUp to set
	 */
	public void setListenUp(JButton listenUp) {
		this.listenUp = listenUp;
	}

	/**
	 * Getter de listenDown
	 * @return the listenDown
	 */
	public JButton getListenDown() {
		return listenDown;
	}

	/**
	 * Setter de listenDown
	 * @param listenDown the listenDown to set
	 */
	public void setListenDown(JButton listenDown) {
		this.listenDown = listenDown;
	}

	/**
	 * Getter de listedLeft
	 * @return the listedLeft
	 */
	public JButton getListedLeft() {
		return listedLeft;
	}

	/**
	 * Setter de listedLeft
	 * @param listedLeft the listedLeft to set
	 */
	public void setListedLeft(JButton listedLeft) {
		this.listedLeft = listedLeft;
	}

	/**
	 * Getter de listenRight
	 * @return the listenRight
	 */
	public JButton getListenRight() {
		return listenRight;
	}

	/**
	 * Setter de listenRight
	 * @param listenRight the listenRight to set
	 */
	public void setListenRight(JButton listenRight) {
		this.listenRight = listenRight;
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
//		if(e.getSource() == getListenUp() ){
//			 juego.moveBall(0);
//			 juego.repaint();
//		} else if(e.getSource() == getListenDown()){
//			juego.moveBall(1);
//			 juego.repaint();
//		}else if(e.getSource() == getListedLeft()){
//			juego.moveBall(2);
//			 juego.repaint();
//		}else if(e.getSource() == getListenRight()){
//			juego.moveBall(3);
//			 juego.repaint();
//		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		pressed = true;

			
			if(e.getSource() == getListenUp() ){
				 juego.moveBall(0);
				 juego.repaint();
			} else if(e.getSource() == getListenDown()){
				juego.moveBall(1);
				 juego.repaint();
			}else if(e.getSource() == getListedLeft()){
				juego.moveBall(2);
				 juego.repaint();
			}else if(e.getSource() == getListenRight()){
				juego.moveBall(3);
				 juego.repaint();
			}
		
		
	}
	

	@Override
	public void mouseReleased(MouseEvent e) {

		pressed = false;
		
	}



}

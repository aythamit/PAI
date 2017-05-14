/**
 * ControladoraBotones.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 28 abr. 2017
 *
 */
package trayectoria.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import trayectoria.modelo.Parabola;
import trayectoria.vista.PanelBotones;
import trayectoria.vista.PanelProyectil;

public class ControladoraBotones {

	PanelProyectil proyectiles;
	PanelBotones botones;
	
	public ControladoraBotones(PanelProyectil panelArriba, PanelBotones panelAbajo) {
		setProyectiles(panelArriba);
		setBotones(panelAbajo);
		
		aniadirBotones();
		aniadirSlider();
		aniadirChecks();
		
	}

	/**
	 * 
	 */
	private void aniadirChecks() {
		//Action Event de CheckRastro
		getBotones().getChcRastro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				if(getProyectiles().isMostrarRastro())
					getProyectiles().setMostrarRastro(false);
				else
					getProyectiles().setMostrarRastro(true);
				
				getProyectiles().repaint();
				
			}

		});
		
		getBotones().getChcVelocidad().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				if(getProyectiles().isMostrarVelocidades())
					getProyectiles().setMostrarVelocidades(false);
				else
					getProyectiles().setMostrarVelocidades(true);
				
				getProyectiles().repaint();
				
			}

		});
		
		getBotones().getChcVector().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				if(getProyectiles().isMostrarVector())
					getProyectiles().setMostrarVector(false);
				else
					getProyectiles().setMostrarVector(true);
				
				getProyectiles().repaint();
				
			}

		});
		
	}

	/**
	 * 
	 */
	private void aniadirSlider() {
		getBotones().getSldVelocidad().addChangeListener( new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				getBotones().getLblVelocidad().setText("Velocidad inicial " + getBotones().getSldVelocidad().getValue() + " m/s");
			}
			
		});
				
		getBotones().getSldGrados().addChangeListener( new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				getBotones().getLblGrados().setText("Angulo inicial " + getBotones().getSldGrados().getValue() + " grados");
			}
			
		});
		
		getBotones().getSldAltura().addChangeListener( new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				getBotones().getLblAltura().setText("Altura inicial " + getBotones().getSldAltura().getValue() + " m");
			}
			
		});
	}

	/**
	 * 
	 */
	private void aniadirBotones() {
		
		getBotones().getLanzar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int vel = getBotones().getSldVelocidad().getValue();
				int gr =  getBotones().getSldGrados().getValue();
				int altura = getBotones().getSldAltura().getValue();
				getProyectiles().getParabolas().add(new Parabola(vel, gr, altura));			
				getProyectiles().repaint();
				
			}

		});
		
		getBotones().getBorrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				getProyectiles().getParabolas().clear();			
				getProyectiles().repaint();	
			}

		});
		
	}

	/**
	 * Getter de proyectiles
	 * @return the proyectiles
	 */
	public PanelProyectil getProyectiles() {
		return proyectiles;
	}

	/**
	 * Setter de proyectiles
	 * @param proyectiles the proyectiles to set
	 */
	public void setProyectiles(PanelProyectil proyectiles) {
		this.proyectiles = proyectiles;
	}

	/**
	 * Getter de botones
	 * @return the botones
	 */
	public PanelBotones getBotones() {
		return botones;
	}

	/**
	 * Setter de botones
	 * @param botones the botones to set
	 */
	public void setBotones(PanelBotones botones) {
		this.botones = botones;
	}

}

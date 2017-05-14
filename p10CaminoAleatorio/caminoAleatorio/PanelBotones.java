/**
 * PanelBotones.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 17 abr. 2017
 *
 */
package caminoAleatorio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel{
	
		private static final int ANCHOBTN = 180;
		private static final int ALTOBTN = 50;
		JButton btnComenzar;
		JButton btnFinalizar;
		JButton btnColor;
		JPanel panelInterior = new JPanel();
		boolean finalizar;
		Timer Reloj;

	public PanelBotones(){
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10 , 10));
		panelInterior.setLayout(new GridLayout(3 , 1, 20 , 30));
		btnComenzar = new JButton("Comenzar");
		btnComenzar.setSize(new Dimension(ANCHOBTN, ALTOBTN));
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setSize(new Dimension(ANCHOBTN, ALTOBTN));
		
		btnColor = new JButton("Color");
		btnColor.setSize(new Dimension(ANCHOBTN, ALTOBTN));
		
		finalizar = false;
		
		panelInterior.add(btnComenzar);
		panelInterior.add(btnFinalizar);
		panelInterior.add(btnColor);
		add(panelInterior);
	}

	public void aniadirFuncion(PanelJuego panelJuego){
		getBtnColor().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int red = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				
				panelJuego.getSerpiente().setColor(new Color(red, green , blue));
			}
		});
		
		
		getBtnComenzar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {{
			    Thread thread = new Thread() {
				      public void run()
				      {
				        while(!panelJuego.getSerpiente().isBorde() && !finalizar)
				        {
				                SwingUtilities.invokeLater(new Runnable() {
				                    public void run() {

										panelJuego.getSerpiente().moveAleatorio();
										panelJuego.repaint();
				                }
				            });

				            try
				            {
				                Thread.sleep(100);
				            } 
				            catch (InterruptedException e) 
				            {
				                e.printStackTrace();
				            }

				           
				        }
				       }
				     
				    };

				    thread.start();
				}}		
		});
	
		getBtnFinalizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				finalizar = true;
				Thread.interrupted();
			}
		});
	
	}
	

	
	/**
	 * Getter de btnComenzar
	 * @return the btnComenzar
	 */
	public JButton getBtnComenzar() {
		return btnComenzar;
	}

	/**
	 * Setter de btnComenzar
	 * @param btnComenzar the btnComenzar to set
	 */
	public void setBtnComenzar(JButton btnComenzar) {
		this.btnComenzar = btnComenzar;
	}

	/**
	 * Getter de btnFinalizar
	 * @return the btnFinalizar
	 */
	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	/**
	 * Setter de btnFinalizar
	 * @param btnFinalizar the btnFinalizar to set
	 */
	public void setBtnFinalizar(JButton btnFinalizar) {
		this.btnFinalizar = btnFinalizar;
	}

	/**
	 * Getter de btnColor
	 * @return the btnColor
	 */
	public JButton getBtnColor() {
		return btnColor;
	}

	/**
	 * Setter de btnColor
	 * @param btnColor the btnColor to set
	 */
	public void setBtnColor(JButton btnColor) {
		this.btnColor = btnColor;
	}
	
	/**
	 * Getter de finalizar
	 * @return the finalizar
	 */
	public boolean isFinalizar() {
		return finalizar;
	}

	/**
	 * Setter de finalizar
	 * @param finalizar the finalizar to set
	 */
	public void setFinalizar(boolean finalizar) {
		this.finalizar = finalizar;
	}
}



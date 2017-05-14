package quickHull;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * QuickHullFrame.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 24 abr. 2017
 *
 */

@SuppressWarnings("serial")
public class QuickHullFrame extends JFrame{

	private static final int NPUNTOS = 50;
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGTH = 800;
	public static final int PANEL_WIDTH = FRAME_WIDTH;
	public static final int PANEL_HEIGTH = FRAME_HEIGTH / 2;
	private JButton inicializar;
	private JButton calcular;
	private JButton pausar;
	private JButton clear;
	private QuickHullPanel panelPuntos;
	
	public QuickHullFrame(){
		//add(new QuickHullPanel());
		construyeVentana();
	}
	/**
	 * 
	 */
	private void construyeVentana() {
		setTitle("QuickHull");
		setSize(FRAME_WIDTH,FRAME_HEIGTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new GridLayout(2 , 1));
		initBotones();
	}
	
	private void initBotones(){
		
		setCalcular(new JButton("Calcular"));
		getCalcular().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				calcularQuick();
			}
		});
		setInicializar(new JButton("Inicializar"));
		getInicializar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				IniciarlizarQuick();
			}

		});
		
		setClear(new JButton("Clear"));
		getClear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				clearQuick();
			}


		});
		setPausar(new JButton("Pausar"));
		getCalcular().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				IniciarlizarQuick();
			}

		});
		
		
		setPanelPuntos(new QuickHullPanel());
		
		
		
		add(getPanelPuntos());
		JPanel panelBotones = new JPanel();
		panelBotones.add(getInicializar());
		panelBotones.add(getCalcular());
		panelBotones.add(getPausar());
		panelBotones.add(getClear());
		add(panelBotones);
	}
	
	private void clearQuick() {
		// TODO Auto-generated method stub
		getPanelPuntos().clearPoints();
	}
	
	private void calcularQuick() {
		
		QuickHull qh = new QuickHull();
		try{
			List<Punto> puntos = qh.calcularQuickHull(getPanelPuntos().getPuntos());
			getPanelPuntos().clearPoints();
			getPanelPuntos().addPoints(puntos);
			getPanelPuntos().drawLines();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	

	private void IniciarlizarQuick() {
		
		List<Punto> puntos = new ArrayList<Punto>();
		for(int i = 0; i < NPUNTOS; i++){
			int randomX = (int) (Math.random() * PANEL_WIDTH);
			int randomY = (int) (Math.random() * PANEL_HEIGTH);
			puntos.add(new Punto(randomX, randomY));
			}
		
		getPanelPuntos().clearPoints();
		getPanelPuntos().addPoints(puntos);
		getPanelPuntos().savePoints(puntos);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new QuickHullFrame();

	}
	/**
	 * Getter de calcular
	 * @return the calcular
	 */
	public JButton getCalcular() {
		return calcular;
	}
	/**
	 * Setter de calcular
	 * @param calcular the calcular to set
	 */
	public void setCalcular(JButton calcular) {
		this.calcular = calcular;
	}
	/**
	 * Getter de pausar
	 * @return the pausar
	 */
	public JButton getPausar() {
		return pausar;
	}
	/**
	 * Setter de pausar
	 * @param pausar the pausar to set
	 */
	public void setPausar(JButton pausar) {
		this.pausar = pausar;
	}
	/**
	 * Getter de panelPuntos
	 * @return the panelPuntos
	 */
	public QuickHullPanel getPanelPuntos() {
		return panelPuntos;
	}
	/**
	 * Setter de panelPuntos
	 * @param panelPuntos the panelPuntos to set
	 */
	public void setPanelPuntos(QuickHullPanel panelPuntos) {
		this.panelPuntos = panelPuntos;
	}
	/**
	 * Getter de inicializar
	 * @return the inicializar
	 */
	public JButton getInicializar() {
		return inicializar;
	}
	/**
	 * Setter de inicializar
	 * @param inicializar the inicializar to set
	 */
	public void setInicializar(JButton inicializar) {
		this.inicializar = inicializar;
	}
	/**
	 * Getter de clear
	 * @return the clear
	 */
	public JButton getClear() {
		return clear;
	}
	/**
	 * Setter de clear
	 * @param clear the clear to set
	 */
	public void setClear(JButton clear) {
		this.clear = clear;
	}

}

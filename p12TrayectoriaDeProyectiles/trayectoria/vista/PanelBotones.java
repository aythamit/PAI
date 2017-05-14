/**
 * PanelBotones.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 27 abr. 2017
 *
 */
package trayectoria.vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel{
	
	private final int COLUMNAS = 4;
	private final int FILAS = 3;
	private JButton lanzar;
	private JButton pausa;
	private JButton borrar;
	private JLabel lblVelocidad;
	private JLabel lblGrados;
	private JLabel lblAltura;
	private JSlider sldVelocidad;
	private JSlider sldGrados;
	private JSlider sldAltura;
	private JLabel lblMostrarVelocidad;
	private JLabel lblMostrarRastro;
	private JLabel lblMostrarVector;
	private JCheckBox chcVelocidad;
	private JCheckBox chcRastro;
	private JCheckBox chcVector;
	
	
	public PanelBotones(){
		setLayout(new GridLayout( FILAS, COLUMNAS, 5, 5));
		setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.black), "Controles"));
		initComponents();
	}

	/**
	 * 
	 */
	private void initComponents() {
		
		//Creamos botones
		setLanzar(new JButton("Lanzar"));
		setPausa(new JButton("Pausa"));
		setBorrar(new JButton("Borrar"));
		
		//Creamos Label
		setLblVelocidad(new JLabel("Velocidad inicial 50 m/s"));
		setLblGrados(new JLabel("Angulo inicial 60 grados"));
		setLblAltura(new JLabel("Altura inicial 0 m"));
		
		//Creamos Sliders
		setSldVelocidad(new JSlider(0 , 150));
		setSldGrados(new JSlider(0 , 90));
		setSldAltura(new JSlider(0 , 400));
		getSldAltura().setValue(0);
				
		//Creamos CheckBox
		setChcVelocidad(new JCheckBox());
		setChcRastro(new JCheckBox());
		setChcVector(new JCheckBox());
		getChcVelocidad().setText("Mostrar Velocidades");
		getChcRastro().setText("Mostrar Rastro");;
		getChcVector().setText("Mostrar vector de posicion");
		
		//Añadimos primera fila
		add(getLanzar());
		add(getLblVelocidad());
		add(getSldVelocidad());
		add(getChcVelocidad());
		//Añadimos segunda fila
		add(getPausa());
		add(getLblGrados());
		add(getSldGrados());
		add(getChcRastro());
		//Añadimos tercera fila
		add(getBorrar());
		add(getLblAltura());
		add(getSldAltura());
		add(getChcVector());
		
		//aniadirFuncionalidad();
	}

	/**
	 * Getter de lanzar
	 * @return the lanzar
	 */
	public JButton getLanzar() {
		return lanzar;
	}

	/**
	 * Setter de lanzar
	 * @param lanzar the lanzar to set
	 */
	public void setLanzar(JButton lanzar) {
		this.lanzar = lanzar;
	}

	/**
	 * Getter de pausa
	 * @return the pausa
	 */
	public JButton getPausa() {
		return pausa;
	}

	/**
	 * Setter de pausa
	 * @param pausa the pausa to set
	 */
	public void setPausa(JButton pausa) {
		this.pausa = pausa;
	}

	/**
	 * Getter de borrar
	 * @return the borrar
	 */
	public JButton getBorrar() {
		return borrar;
	}

	/**
	 * Setter de borrar
	 * @param borrar the borrar to set
	 */
	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	/**
	 * Getter de lblVelocidad
	 * @return the lblVelocidad
	 */
	public JLabel getLblVelocidad() {
		return lblVelocidad;
	}

	/**
	 * Setter de lblVelocidad
	 * @param lblVelocidad the lblVelocidad to set
	 */
	public void setLblVelocidad(JLabel lblVelocidad) {
		this.lblVelocidad = lblVelocidad;
	}

	/**
	 * Getter de lblGrados
	 * @return the lblGrados
	 */
	public JLabel getLblGrados() {
		return lblGrados;
	}

	/**
	 * Setter de lblGrados
	 * @param lblGrados the lblGrados to set
	 */
	public void setLblGrados(JLabel lblGrados) {
		this.lblGrados = lblGrados;
	}

	/**
	 * Getter de lblAltura
	 * @return the lblAltura
	 */
	public JLabel getLblAltura() {
		return lblAltura;
	}

	/**
	 * Setter de lblAltura
	 * @param lblAltura the lblAltura to set
	 */
	public void setLblAltura(JLabel lblAltura) {
		this.lblAltura = lblAltura;
	}

	/**
	 * Getter de sldVelocidad
	 * @return the sldVelocidad
	 */
	public JSlider getSldVelocidad() {
		return sldVelocidad;
	}

	/**
	 * Setter de sldVelocidad
	 * @param sldVelocidad the sldVelocidad to set
	 */
	public void setSldVelocidad(JSlider sldVelocidad) {
		this.sldVelocidad = sldVelocidad;
	}

	/**
	 * Getter de sldGrados
	 * @return the sldGrados
	 */
	public JSlider getSldGrados() {
		return sldGrados;
	}

	/**
	 * Setter de sldGrados
	 * @param sldGrados the sldGrados to set
	 */
	public void setSldGrados(JSlider sldGrados) {
		this.sldGrados = sldGrados;
	}

	/**
	 * Getter de sldAltura
	 * @return the sldAltura
	 */
	public JSlider getSldAltura() {
		return sldAltura;
	}

	/**
	 * Setter de sldAltura
	 * @param sldAltura the sldAltura to set
	 */
	public void setSldAltura(JSlider sldAltura) {
		this.sldAltura = sldAltura;
	}

	/**
	 * Getter de lblMostrarVelocidad
	 * @return the lblMostrarVelocidad
	 */
	public JLabel getLblMostrarVelocidad() {
		return lblMostrarVelocidad;
	}

	/**
	 * Setter de lblMostrarVelocidad
	 * @param lblMostrarVelocidad the lblMostrarVelocidad to set
	 */
	public void setLblMostrarVelocidad(JLabel lblMostrarVelocidad) {
		this.lblMostrarVelocidad = lblMostrarVelocidad;
	}

	/**
	 * Getter de lblMostrarRastro
	 * @return the lblMostrarRastro
	 */
	public JLabel getLblMostrarRastro() {
		return lblMostrarRastro;
	}

	/**
	 * Setter de lblMostrarRastro
	 * @param lblMostrarRastro the lblMostrarRastro to set
	 */
	public void setLblMostrarRastro(JLabel lblMostrarRastro) {
		this.lblMostrarRastro = lblMostrarRastro;
	}

	/**
	 * Getter de lblMostrarVector
	 * @return the lblMostrarVector
	 */
	public JLabel getLblMostrarVector() {
		return lblMostrarVector;
	}

	/**
	 * Setter de lblMostrarVector
	 * @param lblMostrarVector the lblMostrarVector to set
	 */
	public void setLblMostrarVector(JLabel lblMostrarVector) {
		this.lblMostrarVector = lblMostrarVector;
	}

	/**
	 * Getter de chcVelocidad
	 * @return the chcVelocidad
	 */
	public JCheckBox getChcVelocidad() {
		return chcVelocidad;
	}

	/**
	 * Setter de chcVelocidad
	 * @param chcVelocidad the chcVelocidad to set
	 */
	public void setChcVelocidad(JCheckBox chcVelocidad) {
		this.chcVelocidad = chcVelocidad;
	}

	/**
	 * Getter de chcRastro
	 * @return the chcRastro
	 */
	public JCheckBox getChcRastro() {
		return chcRastro;
	}

	/**
	 * Setter de chcRastro
	 * @param chcRastro the chcRastro to set
	 */
	public void setChcRastro(JCheckBox chcRastro) {
		this.chcRastro = chcRastro;
	}

	/**
	 * Getter de chcVector
	 * @return the chcVector
	 */
	public JCheckBox getChcVector() {
		return chcVector;
	}

	/**
	 * Setter de chcVector
	 * @param chcVector the chcVector to set
	 */
	public void setChcVector(JCheckBox chcVector) {
		this.chcVector = chcVector;
	}

}

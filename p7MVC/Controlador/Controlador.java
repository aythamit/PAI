package Controlador;

import java.awt.EventQueue;
import java.util.ArrayList;

import Modelo.Moneda;
import Vista.PanelMoneda;
import Vista.VentanaPrincipal;

public class Controlador {
	public static int NEuros = 100;
	public static int NMonedas = 4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList<String> Monedas = new ArrayList<String>();
					Monedas.add("Dolar");
					Monedas.add("Yenes");
					Monedas.add("Rupias");
					Monedas.add("Libras");
					VentanaPrincipal frame = new VentanaPrincipal();
					@SuppressWarnings("unused")
					ArrayList<PanelMoneda> paneles = new ArrayList<PanelMoneda>();
					for(int i = 0; i < NMonedas; i++){
						frame.add(new PanelMoneda(Monedas.get(i) , String.valueOf(1 * Moneda.conversor(Monedas.get(i)) ) , String.valueOf(NEuros) , 
								String.valueOf( NEuros * Moneda.conversor(Monedas.get(i)) ) ) );
					}
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}

}

/**
 * Controlador.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 30 mar. 2017
 *
 */
package eventos;

public class Controlador {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		JuegoPanel juego = new JuegoPanel(VentanaPrincipal.MAX_WIDTH, VentanaPrincipal.MAX_HEIGHT / 2, Integer.parseInt(args[0]));
		VentanaPrincipal ventana = new VentanaPrincipal(juego);
		añadirFuncionBotones(ventana, juego);
		ventana.add(juego);
		

		ventana.añadirBotones();
		
		

	}
	
	public static void añadirFuncionBotones(VentanaPrincipal ventana, JuegoPanel juego){
		
		Listener listen = new Listener(ventana.getUp(), ventana.getDown(), ventana.getLeft(), ventana.getRight(), juego);
		
		ventana.getUp().addMouseListener(listen);	
		ventana.getDown().addMouseListener(listen);
		ventana.getLeft().addMouseListener(listen);
		ventana.getRight().addMouseListener(listen);
	}

}

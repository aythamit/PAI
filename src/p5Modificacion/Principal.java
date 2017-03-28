/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 5 - Juego de la Vida / Modificiacion
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p5Modificacion;

public class Principal {
	static final int MAX = 1000000;
	private static final int NVECES = 15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock temporizador = new Clock();
		temporizador.start();
		      long total = 0;
		      for (int i = 0; i < MAX; i++) {
		         total += i;
		      }
		temporizador.stop();
		System.out.println("El tiempo que tarda es: " + temporizador.getElapsedTime() + " milisegundos.");
		///// Tiempo
		Tiempo t1 = new Tiempo(14,00,00);
		
		for(int i = 0; i < NVECES; i++){
			t1.sumarSegundos(1000);
			System.out.println(t1);
		}

	}

}

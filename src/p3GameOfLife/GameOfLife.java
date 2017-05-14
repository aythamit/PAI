/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 5 - Juego de la Vida
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p3GameOfLife;

import java.io.IOException;

//import p5Modificacion.Clock;

public class GameOfLife {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		boolean debug;
		//Clock temporizador = new Clock();
		int nPasos = Integer.parseInt(args[0]);
		Matrix tablero = new Matrix(args[1]);
		tablero.mostrarMatriz();
		if(args.length < 4){
			debug = false;
		}else{
			debug = true;
		}
		//temporizador.start();
		run(nPasos, tablero,args[2],debug);
		//temporizador.stop();
		
		System.out.println("El tiempo que tarda es: " +  " milisegundos.");

	}
	/**
	 * Metodo run donde se llamara a la funcio de actualizarVidas de la matriz mientras no se hayan dado los pasos 
	 * o quede alguna celula viva.
	 * @param nPasos numero de pasos que dará como maximo
	 * @param tablero matriz de la poblacion
	 * @param archivo archivo donde vamos a guardar la poblacion.
	 * @param debug
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void run(int nPasos, Matrix tablero, String archivo, boolean debug) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		int cont=1;
		while(cont <= nPasos && !tablero.todosMuertos())
		{	
			System.out.println(" Paso: "  + cont + " de " + nPasos + "\n");
			tablero.actualizarVidas();
			tablero.mostrarMatriz();
			if(debug)
				tablero.escribirMatriz(archivo,debug);
			Thread.sleep(10);
			cont++;
		}
		if(!debug)
			tablero.escribirMatriz(archivo,debug);
	}

}

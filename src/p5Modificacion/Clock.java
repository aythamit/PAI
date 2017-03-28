/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 5 - Juego de la Vida / Modificiacion
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p5Modificacion;


/**
 * Clase Clock que sive medir el tiempo de ejecución de un segmento de código en Java.
 */
public class Clock {

	private long inicio;
	private long fin;
	
	/**
	 * Constructor por defecto de la clase Clock
	 */
		public Clock(){
			inicio = 0;
			fin = 0;
		}
		
		/**
		 * 
		 * @return el tiempo inicial.
		 */
		public long getInicio() {
			return inicio;
		}
		
		/**
		 * Le damos a inicio el valor del parametro.
		 * @param inicio
		 */
		public void setInicio(long inicio) {
			this.inicio = inicio;
		}
		
		/**
		 * 
		 * @return el tiempo al final.
		 */
		public long getFin() {
			return fin;
		}
		
		/**
		 * Le damos a fin el valor del parametro.
		 * @param fin
		 */
		public void setFin(long fin) {
			this.fin = fin;
		}
	
		/**
		 * El metodo start inicia el tiempo de inicio.
		 */
		public void start(){
			inicio = System.currentTimeMillis();
		}
		
		/**
		 * El metodo stop inicia el tiempo de la tarea ya terminada
		 */
		public void stop(){
			fin = System.currentTimeMillis();
		}
		
		/**
		 * Metodo restart, reinicia el temporizador.
		 */
		public void restart(){
			inicio =0;
			fin = 0;
		}
		/**
		 *  El metodo getElapseTime resta el tiempo fin al tiempo de inicio, con lo cual retorna el tiempo 
		 *  en milisegundos de la ejecucion.
		 * @return la resta entre el fin y el inicio.
		 */
		public long getElapsedTime(){
			return fin - inicio;
		}

}

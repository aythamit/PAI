/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 5 - Juego de la Vida
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p3GameOfLife;
/**
 * Clase Celula, contiene los Atributos Cell que es una String que contendra la celula.
 * Y un booleano que dirá si el siguiente estado es vivo o  Muerto
 *
 */
public class Cell {
	String cell;
	boolean nextEstado;
	
	/**
	 * Constructor de Cell, si el parametro c es "o" significa que esta viva, 
	 * y el siguiente estado sera vivo a no ser que se den las condiciones para que no lo este.
	 * @param c
	 */
	public Cell(String c){
		cell = c;
		if(cell.equals("o"))
			nextEstado = true;
		else
		nextEstado = false;
	}
	
	/**
	 * 
	 * @return verdadero si cell es igual a "o".
	 */
	public boolean isViva(){
		if(cell.equals("o"))
		return true;
		else
			return false;
	}
	
	/**
	 * 
	 * @param matrix Matriz de datos de la poblacion.
	 * @param i posicion N de la matriz
	 * @param j posicion M de la matriz
	 * Metodo que calcula las posiciones adjuntas a la posicion indicada por parametros para saber
	 * cuantas celulas vivas hay alrededor.
	 * En caso de que la celula este muerta y alrededor tenga 3 celulas vivas. El siguiente estado sera vivo.
	 * En caso de que este viva y tenga menos de 2 celulas vivas o  mas de 3 celulas vivas alrededor.
	 * El siguiente estado sera muerte de la celula.
	 */
	public void actualizar(Matrix matrix, int i, int j){
		int contadorvivos = 0;
		if(matrix.inRange(i -1, j -1) && matrix.getCell(i -1, j -1).isViva()) contadorvivos++;
		if(matrix.inRange(i -1, j) && matrix.getCell(i -1, j).isViva()) contadorvivos++;
		if(matrix.inRange(i -1, j +1) && matrix.getCell(i -1, j +1).isViva()) contadorvivos++;
		if(matrix.inRange(i  , j -1) && matrix.getCell(i  , j -1).isViva()) contadorvivos++;
		if(matrix.inRange(i  , j +1) && matrix.getCell(i  , j +1).isViva()) contadorvivos++;
		if(matrix.inRange(i +1, j -1) && matrix.getCell(i +1, j -1).isViva()) contadorvivos++;
		if(matrix.inRange(i +1  , j) && matrix.getCell(i +1  , j).isViva()) contadorvivos++;
		if(matrix.inRange(i +1, j +1) && matrix.getCell(i +1, j +1).isViva()) contadorvivos++;
		
		if(!isViva() && contadorvivos == 3)
			nextEstado = true;
		else if(isViva() && (contadorvivos < 2 || contadorvivos > 3)){
			nextEstado = false;
		}
	}
	
	/**
	 * Metodo que actualiza la matriz hacia el siguiente estado. 
	 * Si el nextEstado es true, estará viva
	 * En caso contrario, estara muerta.
	 */
	public void transicion(){
		if(nextEstado)
			cell = "o";
		else
			cell = "*";
	}
	
	/**
	 * Metodo que convierte la Clase Cell en una String para poder mostrarla por la consola.
	 */
	public String toString(){
		return cell;
	}
}

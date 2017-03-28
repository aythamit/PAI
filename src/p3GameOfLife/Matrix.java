/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 5 - Juego de la Vida
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p3GameOfLife;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Matrix {
	private Cell[][] mCelulas;
	private int n;
	private int m;
	
	/**
	 *  Constructor de la clase Matrix que contendrá la poblacion de las celulas 
	 *  segun el archivo pasado por parametros
	 * @param archivoLectura nombre del archivo donde leeremos la matriz.
	 * @throws IOException
	 */
	public Matrix(String archivoLectura) throws IOException{
		String cadena;
		char[] cadAux;
        FileReader fichero = new FileReader(archivoLectura);
        BufferedReader b = new BufferedReader(fichero);
        n = Integer.parseInt(b.readLine());
        m = Integer.parseInt(b.readLine());
        mCelulas = new Cell[n][m];
        for(int i = 0; i< n;i++){
        	cadena = b.readLine();
        	cadAux = cadena.toCharArray();
        	for(int j=0;j<m;j++)
        		setCell(i,j ,String.valueOf(cadAux[j]));
        }
	}
	
/**
 * Constructor de la clase Matrix que crea una matriz de n x M celulas.
 * @param n numero de filas
 * @param m numero de columnas.
 */
	public Matrix(int n, int m){
		this.n = n;
		this.m = m;
		
		mCelulas = new Cell[n][m];
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	public void setCell(int i, int j, String c){
		mCelulas[i][j] = new Cell(c);
	}
	public Cell getCell(int i, int j){
		return mCelulas[i][j];
	}
	
	/**
	 * Metodo que calcula en primera instancia el siguiente estado de cada celula de la matriz
	 * Y posteriormente, hace la transicion entre el estado actual y el estado siguiente previamente calculado.
	 */
	public void actualizarVidas(){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				mCelulas[i][j].actualizar(this, i , j);
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				mCelulas[i][j].transicion();
			}
		}
	}
	
	/**
	 * Metodo para mostrar la matriz.
	 */
	public void mostrarMatriz(){
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(mCelulas[i][j]);
			}
			System.out.println("");
		}
	}
	
	/**
	 *  Metodo que devuelve un false, si hay alguna celula viva dentro de la poblacion
	 *  y False en caso de que todas las celulas hayan muerto.
	 * @return
	 */
	public boolean todosMuertos() {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mCelulas[i][j].isViva()){	
					return false;
				}
				
			}
		}
		return true;
	}
	
	/**
	 * Metodo que devuelve true si las coordenadas pasadas por parametros estan dentro de la matriz
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean inRange(int i, int j) {
			if(i < getN() && i >= 0 && j < getM() && j >= 0)
				return true;
			else
				return false;
	}
	
	/**
	 * Metodo que escribe la matriz en el archivo pasado por parametros.
	 * @param archivo
	 * @param debug Parametro que decidira si escribimos la traza o sobreescribimos el archivo.
	 * @throws IOException 
	 */
	public void escribirMatriz(String archivo, boolean debug) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fichero;
        BufferedWriter bw;
		if(debug){ // Escribimos seguido
			
	            fichero = new FileWriter(archivo,true);
	            bw = new BufferedWriter(fichero);
	            for(int i=0;i<n;i++){
	    			for(int j=0;j<m;j++){
	    				bw.write(mCelulas[i][j].toString());
	    				
	    			}
	    			bw.write("\n");
	    		}
	            bw.write("\n");
		} else { // Sobreescribimos el contenido para que solo se muestre el final.
			fichero = new FileWriter(archivo);
			bw = new BufferedWriter(fichero);
            for(int i=0;i<n;i++){
    			for(int j=0;j<m;j++){
    				bw.write(mCelulas[i][j].toString());
    				
    			}
    			bw.write("\n");
    		}
            bw.write("\n");
		}
		
		bw.close();
	}
}

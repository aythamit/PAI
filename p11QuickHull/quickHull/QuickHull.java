/**
 * QuickHull.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 25 abr. 2017
 *
 */
package quickHull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QuickHull {

	public List<Punto> calcularQuickHull(List<Punto> inputPoints) {
		List<Punto> convexHull = new ArrayList<Punto>();
		if(inputPoints.isEmpty()){		
			throw new IllegalArgumentException("No se puede calcula una Envolvente convexa de cero puntos.");
		} 
		
			// Calculamos los extremos.
			Punto puntoDerecha = inputPoints.get(0);
			Punto puntoIzquierda = inputPoints.get(0);
			
			for(Punto it : inputPoints){
				 if (it.equals(puntoDerecha) || it.equals(puntoIzquierda)) {
		                continue;
		            }
				if( it.getX() < puntoDerecha.getX()){
					puntoDerecha = it;
				} else if (it.getX() > puntoIzquierda.getX()){
					puntoIzquierda = it;
				}
			}
			
			// Dividmos en dos mitades.
			 List<Punto> leftOfLine = new LinkedList<>();
		     List<Punto> rightOfLine = new LinkedList<>();
		     
			for(Punto it : inputPoints){
				if(it.equals(puntoDerecha) || it.equals(puntoIzquierda)) {
					continue;
				}
				if(it.isLeftOfLine(puntoDerecha, puntoIzquierda)){
					leftOfLine.add(it);
				} else {
					rightOfLine.add(it);
				}
			}
			
			convexHull.add(puntoIzquierda);
			List<Punto> hull = divide(leftOfLine, puntoIzquierda, puntoDerecha);
			convexHull.addAll(hull);
			convexHull.add(puntoDerecha);
			
			hull = divide(rightOfLine, puntoDerecha, puntoIzquierda);
			convexHull.addAll(hull);
			
			return convexHull;
			
		
		
	}

	/**
	 * @param rightOfLine
	 * @param puntoDerecha
	 * @param puntoIzquierda
	 * @return
	 */
	private List<Punto> divide(List<Punto> puntos, Punto punto1, Punto punto2) {
		
		List<Punto> hull = new ArrayList<Punto>();
		
		if(puntos.isEmpty()){
			return hull;
		} else if(puntos.size() == 1){
			hull.add(puntos.get(0));
			return hull;
		}
		
		
		// Calculamos el puntos mas alejado
		Punto maximaDistancia = puntos.get(0);
		List<Punto> l1 = new LinkedList<>();
		List<Punto> l2 = new LinkedList<>();
		double distancia = 0.0;

		for(Punto it : puntos){
			if(it.getDistanceToLine(punto1, punto2) > distancia){
				distancia = it.getDistanceToLine(punto1, punto2);
				maximaDistancia = it;
			}
		}
		
		puntos.remove(maximaDistancia);
		
		for(Punto it : puntos){
			if(it.isLeftOfLine(punto1, maximaDistancia)){
				l1.add(it);
			}else if (it.isLeftOfLine(maximaDistancia, punto2)){
				l2.add(it);
			}
		}
		
		puntos.clear();
		
		List<Punto> parteHull = divide(l1, punto1, maximaDistancia);
		hull.addAll(parteHull);
		hull.add(maximaDistancia);
		
		parteHull = divide(l2, maximaDistancia, punto2);
		hull.addAll(parteHull);
		
		return hull;
			
	}
}

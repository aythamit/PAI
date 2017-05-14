/**
 * Punto.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 11 : QuickHull
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 24 abr. 2017
 *
 */
package quickHull;

public class Punto {
	private static final double DOUBLE_DELTA = 1E-10;
	private int x;
	private int y;
	
	public Punto(int posX, int posY){
		setX(posX);
		setY(posY);
	}
	
		/**
		 * 
		 * @param from
		 * @param to
		 * @return
		 */
	public boolean isLeftOfLine(Punto from, Punto to) {
        return Double.compare(calcCrossProduct(from, to), 0) > 0;
    }
	
	/**
	 * Calcula el producto cruzado entre dos puntos
	 * @param from
	 * @param to
	 * @return
	 */
	private double calcCrossProduct(Punto origin, Punto p2) {
		// TODO Auto-generated method stub
		return (p2.x - origin.x) * (this.y - origin.y)
                - (p2.y - origin.y) * (this.x - origin.x);
	}

	/**
	 * El punto es considerado collinear si esta en la linea enre los dos puntos
	 * @param p2
	 * @param reference
	 * @return
	 */
	public boolean isCollinearTo(Punto p2, Punto reference) {
        return Math.abs(0.0 - calcCrossProduct(reference, p2)) < DOUBLE_DELTA;
    }


	/**
	 * Metodo que calula la distancia entre dos puntos
	 * @param p2
	 * @return
	 */
	
    public double getDistance(Punto p2) {
        return Math.sqrt((this.x - p2.x) * (this.x - p2.x)
                + (this.y - p2.y) * (this.y - p2.y));
    }
    
    public double getDistanceToLine(Punto a, Punto b) {
        return Math.abs((b.getX() - a.getX()) * (a.getY() - this.y) - (a.getX() - this.x) * (b.getY() - a.getY()))
                / Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
	/**
	 * Getter de x
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Setter de x
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Getter de y
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter de y
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	
    @Override
    public boolean equals(Object o) {
        if (o == null || !o.getClass().equals(this.getClass())) {
            return false;
        }
        if (o == this) {
            return true;
        }
        Punto other = (Punto) o;
        return Math.abs(this.x - other.x) < DOUBLE_DELTA
                && Math.abs(this.y - other.y) < DOUBLE_DELTA;
    }
}

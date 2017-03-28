package p5Modificacion;
/**
 * 
 * @author alu0100837018
 *
 */


/**
 * 
 */
public class Tiempo {
	public static int MAXT = 60;
	public static int MAXH = 24;
	int segundo;
	int minuto;
	int hora;
	

/**
 *  Constructor de la f
 * @param h parametro hora
 * @param m parametro minuto
 * @param s parametro segundo
 */
	Tiempo(int h, int m, int s){
		setHora(h);
		setMinuto(m);
		setSegundo(s);
	}

	public void setSegundo(int s) {
		if(s < MAXT){
			segundo = s;
		}else{
			setMinuto(s / MAXT);
			segundo = s % MAXT;
		}
	}

	public void setMinuto(int m) {
		if(m < MAXT){
			minuto = m;
		}else{
			setHora(m / MAXT);
			minuto = m % MAXT;
		}
		
	}

	public void setHora(int h) {
		if(h < MAXH){
			hora = h;
		}
		
	}
	public int getSegundo() {
		return segundo;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getHora() {
		return hora;
	}
	
	public String toString(){
		return "" + hora + ":" + minuto + ":" + segundo;
	}

	public void siguienteHora() {
		if(getHora() + 1 < MAXH){
			setHora(getHora() + 1);
		} else {
			setHora(0);
		}
		
	}

	public void siguienteMinuto() {
		if(getMinuto() + 1 < MAXT){
			setMinuto(getMinuto()+1);
		} else {
			setMinuto(0);
			siguienteHora();
		}
		
	}

	public void siguienteSegundo() {
		if(getSegundo() + 1 < MAXT){
			setSegundo(getSegundo() + 1);
		}else{
			setSegundo(0);
			siguienteMinuto();
		}
	}
	
	public void anteriorHora(){
		if(getHora() - 1 > 0){
			setHora(getHora()-1);
		}else{
			setHora(MAXH - 1);
		}
	}
	public void anteriorMinuto(){
		if(getMinuto()-1 > 0){
			setMinuto(getMinuto()-1);
		}else{
			setMinuto(MAXT-1);
			anteriorHora();
		}
	}
	public void anteriorSegundo(){
		if(getSegundo()-1 > 0){
			setSegundo(getSegundo()-1);
		}else{
			setSegundo(MAXT-1);
			anteriorMinuto();
		}
	}
	public void sumarSegundos(int s){
		int temp = getSegundo() + s;
		if(temp < MAXT){
			setSegundo(temp);
		}else{
			sumarMinuto(temp / MAXT);
			setSegundo(temp % MAXT);
		}
	}
	public void sumarMinuto(int m){
		int temp = getMinuto() + m;
		if(temp < MAXT){
			setMinuto(temp);
		}else{
			sumarHora(temp / MAXT);
			setMinuto(temp % MAXT);
		}
	}
	public void sumarHora(int h){
		int temp = getHora() + h;
		if(temp < MAXH){
			setHora(temp);
		}else{
			setHora(temp % MAXH);
		}
	}

}

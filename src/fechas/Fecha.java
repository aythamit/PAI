package fechas;

import java.util.ArrayList;

public class Fecha {
	static private int MAX_ANIO = 9999;
	static private int MAX_MES = 12;
	static private int MIN = 1;
	
	private int dia, mes, anio;
	ArrayList<String> diasSemana;
	ArrayList<String> nombreMes;
	public Fecha(int dia, int mes, int anio){
		diasSemana = new ArrayList<String>();
		nombreMes = new ArrayList<String>();
		setAnio(anio);
		setMes(mes);
		setDia(dia);
		
		
		rellenaDiasMes();
	}
	private void rellenaDiasMes(){
		diasSemana.add("Domingo");
		diasSemana.add("Lunes");
		diasSemana.add("Martes");
		diasSemana.add("Miercoles");
		diasSemana.add("Jueves");
		diasSemana.add("Viernes");
		diasSemana.add("Sabado");
		nombreMes.add("Enero");
		nombreMes.add("Febrero");
		nombreMes.add("Marzo");
		nombreMes.add("Abril");
		nombreMes.add("Mayo");
		nombreMes.add("Junio");
		nombreMes.add("Julio");
		nombreMes.add("Agosto");
		nombreMes.add("Septiembre");
		nombreMes.add("Octubre");
		nombreMes.add("Noviembre");
		nombreMes.add("Diciembre");
	}
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		int diaMax = getDiaMax(getMes());
	
		if(dia >= Fecha.MIN && dia <= diaMax)
			this.dia = dia;
		else{
			throw new IllegalArgumentException("Formato de dia incorrecto para el mes actual.");
		}
	}

	private int getDiaMax(int mes) {
		// TODO Auto-generated method stub
		if(mes == 2){
			if(esBisiesto(getAnio())){	// Es bisiesto
				return 29;
			}
			else{
				return 28;
			}
		}else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			return 31;
		else{
			return 30;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes >= Fecha.MIN && mes <= Fecha.MAX_MES)
			this.mes = mes;
		else{
			throw new IllegalArgumentException("El mes debe estar comprendido entre 1 y 12");
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if(anio >= Fecha.MIN && anio <= Fecha.MAX_ANIO)
			this.anio = anio;
		else{
			//Lanzar excepcion
			throw new IllegalArgumentException("El anio debe estar comprendido entre 1 y 9999");
		}
	}

	@Override
	public String toString() {
		return getDiaDeLaSemana() + ", " + getDia() + " de " + getNombreMes() + " de " + getAnio();
	} 
	
	public boolean esFechaValida(int dia, int mes, int anio){
		// comprobamos dia
		if(dia >= Fecha.MIN && dia <= getDiaMax(mes)){
			if(mes >= Fecha.MIN && mes <= Fecha.MAX_MES)
			{
				if(anio >= Fecha.MIN && anio <= Fecha.MAX_ANIO)
						return true;
			}
		}
				
	
		return false;
	}
	public void setFecha(int dia, int mes, int anio){
		if(esFechaValida(dia,mes,anio))
		{
			setDia(dia);
			setMes(mes);
			setAnio(anio);
		}
		else{
			//Lanzamos excepcion
			throw new IllegalArgumentException("dia, mes o anio incorrecto.");
		}
	}
	public boolean esBisiesto(int anio) {
		if(anio%4 == 0 && anio%100 != 0)
			return true;
		else
			return false;
	}
	public int getDiaDeSemana() {
		int d = getDia();
		int m = getMes(); 
		int y = getAnio();
		d+= m<3 ? y-- : y-2;
		return (23 * m/9 + d + 4 + y/4 -y/100 + y/400) % 7;
	}
	public String getDiaDeLaSemana(){
		//System.out.println("El dia de la semana es: " + getDiaDeLaSemana());
		return diasSemana.get(getDiaDeSemana());
		//return "Lunes";
		
	}
	public String getNombreMes(){
		return nombreMes.get(getMes()-1);
	}
	public int shiftedMes(int mes){
		switch(mes){
		case 1:{
			return 11;
		}
		case 2:{
			return 12;
		}
		case 3:{
			return 1;
		}
		case 4:{
			return 2;
		}
		case 5:{
			return 3;
		}
		case 6:{
			return 4;
		}
		case 7:{
			return 5;
		}
		case 8:{
			return 6;
		}
		case 9:{
			return 7;
		}
		case 10:{
			return 8;
		}
		case 11:{
			return 9;
		}
		case 12:{
			return 10;
		}
		
		
		}
		return 0;
	}
	
	public void siguienteDia(){
		if(getDia() == getDiaMax(getMes())){
			setDia(Fecha.MIN);
			siguienteMes();
		}else{
			setDia(getDia()+1);
		}
	}
	public void siguienteMes(){
		if(getMes() == Fecha.MAX_MES){
			siguienteAnio();
			setMes(Fecha.MIN);
		}else{
			if(getDia() > getDiaMax(getMes()+1))
				setDia(getDiaMax(getMes()+1));
			setMes(getMes()+1);
		}
	}
	public void siguienteAnio(){
		if(getAnio()+1 <= Fecha.MAX_ANIO)
		{
			setAnio(getAnio()+1);
		}
	}
	
	public void anteriorDia(){
		if(getDia() == Fecha.MIN){
			if(getMes()-1 != 0)
				setDia(getDiaMax(getMes()-1));
			else
				setDia(getDiaMax(Fecha.MAX_MES));
			anteriorMes();
		}else{
			setDia(getDia()-1);
		}
	}
	public void anteriorMes(){
		if(getMes() == 1){
			
			anteriorAnio();
			setMes(Fecha.MAX_MES);
		}else{
			if(getDia() > getDiaMax(getMes()-1))
				setDia(getDiaMax(getMes()-1));
			setMes(getMes()-1);
		}
	}
	public void anteriorAnio(){
		if(getAnio()-1 >= Fecha.MIN)
		{
			setAnio(getAnio()-1);
		}
	}
	
	
}

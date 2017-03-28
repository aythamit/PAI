package Modelo;

public class Moneda {
	
	public static double conversor(String Moneda){
		switch(Moneda){
			
			case "Libras":{
				return 0.868952;
			}
			case "Dolar":{
				return 1.07500;
			}
			case "Yenes":{
				return 121.129;
			}
			case "Rupias":{
				return 70.2746;
			}
			
		}
		return 0;
	}
}

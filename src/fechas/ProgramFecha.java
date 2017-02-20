package fechas;

public class ProgramFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1 = new Fecha(28, 2, 2012);
		System.out.println(fecha1) ; // martes 28 Feb 2012 
		fecha1.siguienteDia();
		System.out.println(fecha1); // mi´ercoles 29 Feb 2012 
		fecha1.siguienteDia();
		System.out.println(fecha1) ; // jueves 1 Mar 2012 
		fecha1.siguienteMes();
		System.out.println(fecha1) ; // domingo 1 Apr 2012
		fecha1.siguienteAnio();
		System.out.println(fecha1) ; // lunes 1 Apr 2013
		System.out.println("---------------------");
		Fecha fecha2 = new Fecha (2 , 1 , 2012) ;
		System.out.println( fecha2 );  // lunes 2 Ene 2012
		 fecha2.anteriorDia();
		System.out.println(fecha2) ; // domingo 1 Ene 2012
		 fecha2.anteriorDia();
		System.out.println(fecha2) ; // sabado 31 Dic 2011
		fecha2.anteriorMes();
		System.out.println(fecha2) ; // miercoles 30 Nov 2011
		fecha2.anteriorAnio();
		System.out.println(fecha2) ; // martes 30 Nov 2010

	}

}

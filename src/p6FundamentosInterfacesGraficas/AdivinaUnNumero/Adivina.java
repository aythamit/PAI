package p6FundamentosInterfacesGraficas.AdivinaUnNumero;

public class Adivina {
	
	private int num;
		
	public Adivina(){
		setNum((int) (Math.random()*999+1));
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString(){
		return ""+num;
	}
	
	public String CompruebaPremio(String numUsuario){
		String numAleatorio = String.valueOf(getNum());
		if(numAleatorio.equals(numUsuario)){
			return "¡Has acertado el numero! El premio son 10000 €  y el Numero Generado es: " + numAleatorio;		
		}else{
			int cont = 0;
			for(int i = 0; i < numUsuario.length();i++)
				cont += countOccurrences(numAleatorio,numUsuario.charAt(i));
			@SuppressWarnings("unused")
			char numA[] = numAleatorio.toCharArray();
			@SuppressWarnings("unused")
			char numU[] = numUsuario.toCharArray();
			
			if(cont == 3)
				return "¡Has ganado el Segundo Premio! Te llevas 3000€  y el Numero Generado era: " + numAleatorio;
			else if(cont == 2)
				return "¡Has ganado el Tercer Premio! Te llevas 2000€  y el Numero Generado era: " + numAleatorio;	
			else if(cont == 1)
				return "¡Has ganado el Cuarto Premio! Te llevas 1000€  y el Numero Generado era: " + numAleatorio;	
			
		}
		
		
		return "No has acertado ningun numero";
	}




	public int countOccurrences(String haystack, char needle)
	{
	    int count = 0;
	    for (int i=0; i < haystack.length(); i++)
	    {
	        if (haystack.charAt(i) == needle)
	        {
	             count++;
	        }
	    }
	    return count;
	}
}

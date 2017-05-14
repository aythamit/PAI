package p6FundamentosInterfacesGraficas.palabrasNoDuplicadas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class LeeArchivo {
	
	private String archivo;
	
	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public LeeArchivo(String arch, TreeMap<String, Integer> tmap) throws IOException{
		setArchivo(arch);
		String cadena;
		@SuppressWarnings("unused")
		int contInstruc = 0;
        FileReader fichero = new FileReader(archivo);
        @SuppressWarnings("resource")
		BufferedReader b = new BufferedReader(fichero);
        
        while((cadena = b.readLine())!=null) {
        	
        	
        	StringTokenizer tokenNumero = new StringTokenizer(cadena, " ");
        	 while (tokenNumero.hasMoreElements()) {
	                
					String leoToken = tokenNumero.nextElement().toString();
					
					if(!tmap.containsKey(leoToken)){
						tmap.put(leoToken, 1);
					} else {
						int aux = tmap.get(leoToken).intValue() + 1;
						tmap.put(leoToken, aux);
					}
					
        	 }
        
        }
	}

}

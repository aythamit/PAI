/**
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 6 - Guis
 * @author Aythami Torrado Cabrera
 * @date 07/03/2017
 *
 */
package p6FundamentosInterfacesGraficas.toHTML;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ToHtml {
	private String archivo;
	private String toArchivo;
	ArrayList<String> programa = new ArrayList<String>();
	BufferedReader b;
	BufferedWriter output;
	
	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getToArchivo() {
		return toArchivo;
	}

	public void setToArchivo(String toArchivo) {
		this.toArchivo = toArchivo;
	}

	public BufferedReader getB() {
		return b;
	}

	public void setB(BufferedReader b) {
		this.b = b;
	}
	
	public ToHtml(String archleer, String archescribir) throws IOException{
		setArchivo(archleer);
		setToArchivo(archescribir);
		String cadena;
		System.out.println("Leo en " + getArchivo() + " y escribo en " + getToArchivo());
		b = new BufferedReader(new FileReader(getArchivo()));
//		output = new BufferedWriter(new FileWriter(getToArchivo()));
//		if(output == null)
//			System.out.println("holita");
//		output.write("<html><body> Hola");
		while ((cadena = b.readLine())!=null) {
			cadena = cadena.replaceAll("\\s"," ");
			StringTokenizer tokenNumero = new StringTokenizer(cadena, " ");
       	 while (tokenNumero.hasMoreElements()) {
	                
					String leoToken = tokenNumero.nextElement().toString();
					
					programa.add(leoToken);
						
		}
       	 programa.add("\n");
	}
		b.close();
		escribirPrograma();


}

	private void escribirPrograma() throws IOException {
		// TODO Auto-generated method stub
		output = new BufferedWriter(new FileWriter(getToArchivo()));
		output.write("<html><body>");
		for (int i = 0; i< programa.size();i++){
			
			if (Key.contains(programa.get(i)))
				output.write("<b> " + programa.get(i) + " </b> ");
			else if(programa.get(i).contains("/*")){
				output.write("<font color = \"green\">");
				while(!programa.get(i).equals("*/")){
					if(programa.get(i).equals("\n")){
						output.write("<br>");
					}else{
						output.write(programa.get(i));
					}
				i++;
				}
				
				output.write(programa.get(i) + "</font>");
			}		
			else if(programa.get(i).equals("\n")){
				output.write("<br>");
			}
			else if(programa.get(i).contains(" \" ")){
				System.out.println("holica " + i);
				output.write("<font color = \"blue\">");
				while(!programa.get(i).equals("\"")){
					if(programa.get(i).equals("\n")){
						output.write("<br>");
					}else{
						output.write(programa.get(i));
					}
				i++;
				}
				
				output.write(programa.get(i) + "</font>");
			}		
			else
				
				output.write(programa.get(i));
			
		}
		output.write("</body></html>");
		output.close();
	}
}

	

package p6FundamentosInterfacesGraficas.palabrasNoDuplicadas;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NoDuplicadas {
	
	TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
	TreeMap<String, Integer> tmapInverse = new TreeMap<String,Integer>(Collections.reverseOrder());
	
	public TreeMap<String, Integer> getTmapInverse() {
		return tmapInverse;
	}

	public void setTmapInverse(TreeMap<String, Integer> tmapInverse) {
		this.tmapInverse = tmapInverse;
	}

	public TreeMap<String, Integer> getTmap() {
		return tmap;
	}

	public void setTmap(TreeMap<String, Integer> tmap) {
		this.tmap = tmap;
	}

	public NoDuplicadas(String archivo) throws IOException{
		LeeArchivo leo = new LeeArchivo(archivo, tmap);
		limpiaDuplicados();
		invertirTmap();
	}
	
	public void mostrarTmap(){
		

		 
		Set set = getTmapInverse().entrySet();
		Iterator i = set.iterator();
		
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }      
	      
	}
	public void limpiaDuplicados(){
		Set set = getTmap().entrySet();
		Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         	
	         if((Integer)me.getValue() > 1)
	        	 i.remove();
	      } 
	}
	public void invertirTmap(){
		Set set = getTmap().entrySet();
		Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         tmapInverse.put((String) me.getKey(), (Integer)me.getValue());
	      } 
	}

}



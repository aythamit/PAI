package p6FundamentosInterfacesGraficas.toHTML;

public class Key {
	public static int N_KEYS = 50;
	static private String Key[] = { "abstract" , "continue" , "for" ,"new"         
			,"switch","assert"	,"default","goto"
			,"package","synchronized","boolean"	,"do"
			,"if","private"	,"this"	,"break"    
			,"double","implements","protected","throw"
			,"byte"	,"else" ,"import","public"        
			,"throws","case" ,"enum","instanceof"
			,"return","transient","catch","extends"  
			,"int"  ,"short" ,"try","char"     
			,"final","interface"  ,"static","void"
			,"class" ,"finally"	,"long"  ,"strictfp"      
			,"volatile","const"  ,"float"   ,"native"      
			,"super" ,"while"};
	
	static boolean contains(String key){
			for(int i = 0; i < N_KEYS;i++){
				if(key.equals(Key[i]))
					return true;
			}
		return false;
	}

}

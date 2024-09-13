package TestPackage;


public class Main {

//	Aquí tienes otro ejercicio interesante:
//	
//		Ejercicio: Longitud de la Subcadena Palíndroma Más Larga
//
//		Dada una cadena de caracteres, encuentra la longitud de la subcadena palíndroma más larga.
//		Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda.
//		Entrada:
//
//		    Una cadena de caracteres s.
//
//		Salida:
//
//		    La longitud de la subcadena palíndroma más larga en s.
//
//		Ejemplo:
//
//		Entrada:
//
//		java
//
//		s = "babad"
//
//		Salida:
//
//		java
//
//		3  // "bab" o "aba" son palíndromos de longitud 3
//
//		Entrada:
//
//		java
//
//		s = "cbbd"
//
//		Salida:
//
//		java
//
//		2  // "bb" es el palíndromo más largo

		
	public static void main(String[] args) {
		
		String strInputPalin = "ppppssaaaauuuusss";
									
		String strOutput = longestPalin(strInputPalin);
		
		System.out.print("Respuesta: " + strOutput);						 
	}
	
   
    public static String longestPalin(String strInputPalin) {
    	
    	int intStart = 0;
    	String longestPalin = "";
    	
    	if (strInputPalin.length() == 1) {
    		return strInputPalin;
    	}
    	
    	while (intStart != strInputPalin.length() - 1) {
    		
    		for (int i = strInputPalin.length() - 1; i >= 0; i--) {    			
    			
    			if (intStart == i) {    				
    				break;
    			}
    			
    			if (strInputPalin.charAt(i) == strInputPalin.charAt(intStart)) {    				
    				if (checkPalin(strInputPalin, intStart , i)) {    					
    					if(strInputPalin.substring(intStart, i + 1).length() > longestPalin.length()) {
    						longestPalin = strInputPalin.substring(intStart, i + 1);
    						System.out.println("Más largo: " + longestPalin);
    					}
    				}    				
    			}    			    		
    		}    		
    		intStart++;
    	}    	    	
    	
        return longestPalin;
    }
    
    public static boolean checkPalin(String strInputPalin, int intStart, int intEnd)  {
    	
    	for (int i = intEnd; i >= intStart; i--) {    			
    		
    		if (strInputPalin.charAt(i) != strInputPalin.charAt(intStart)) {
    			return false;
    		}    		
    		intStart++;
    	}
    	    	
    	return true;
    }
    


}

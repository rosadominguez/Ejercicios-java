public class Ejercicio12_6 {
  public static void main(String [] args) {
  
	//Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
	//con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
	//convertir un entero en un carácter.
	
	System.out.println("Matrix");
	
	  int numeros;
	
		for ( int i = 0; i < 9000; i++){
	
		  numeros = (int)(Math.random()*93)+32;
	
		  System.out.print((char)(numeros));
	
	    }
     }
}
	
	
	

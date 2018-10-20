public class Ejercicio22_5 {
  public static void main(String [] args){
  
	System.out.println("Numero primos entre 2 y 100");
	
	boolean esPrimo;
	
	
	for (int i=2; i <= 100; i++) {
		esPrimo = true;
		for ( int j= 2; ((j<=(i/2)) && (esPrimo == true)); j++){
			if ((i%j)== 0){
			    esPrimo = false;
			}
		}
		if (esPrimo){
			System.out.println(i);
     }
     }
  }
}

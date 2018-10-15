public class Ejercicio10_5 {
  public static void main(String [] args) {
  
  System.out.println("Calcula la media de numero introducidos por teclados hasta pulsar numero negativo");
  
  int numero = 0;
  int contador = 0;
  int suma = 0;
   
      System.out.println("Introduce numeros (negativo para terminar)");
	  numero = Integer.parseInt(System.console().readLine());
	  
    while (numero >= 0){
	
	  suma = suma + numero;
	  contador++;
	  System.out.println("Introduce numeros (negativo para terminar)");
	  numero = Integer.parseInt(System.console().readLine());
      }
   
    
  System.out.println("la media del numero es: " + (suma / contador ));
}
}

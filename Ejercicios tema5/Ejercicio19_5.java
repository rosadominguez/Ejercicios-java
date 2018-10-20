public class Ejercicio19_5 {
  public static void main(String [] args) {
      System.out.println("Este programa va a dibujar una piramide.");
      
      int altura = 0;
      String caracter;
      
      System.out.println("Por favor, introduzca la altura (numero positivo): ");
      altura = Integer.parseInt(System.console().readLine());
      
      System.out.println("Por favor, introduzca el caracter que quieres utilizar: ");
      caracter = System.console().readLine();
      
      int contador = 1;
      int contadorEspacios = altura - 1;
      int contadorCaracter = 1;
      
       while (contador <= altura) {
		   
		   
		   for (int e = 0;e <= contadorEspacios;e++) {
			   System.out.print(" "); 
			
		   }
		   for (int e = 1; e <= contadorCaracter;e++) {
			System.out.print(caracter);
		   }
		   
	        System.out.println(" ");
	        
	contador++;
	contadorEspacios--;	 
	contadorCaracter +=2; 

   }
  }
 }

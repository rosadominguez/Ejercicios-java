public class Ejercicio11_5 {
  public static void main(String [] args) {
  
    System.out.println("Este programa va a mostrar el cuadrado y el cubo de 1 numero y sus 4 siguientes");
    
    int numero = 0;
    int numeroCuadrado = 0;
    int numeroCubo = 0;
    int ultimo = numero +3;
    
    System.out.println("Introduzca un numero");
    numero = Integer.parseInt(System.console().readLine());
     
    System.out.println("  NUMERO   CUADRADO      CUBO");   
    System.out.printf("%5s %10s %12s\n",numero, numero*numero, numero*numero*numero);
    
   for (int i = 0;( i <= ultimo); i++){
	    numero++;
		numeroCuadrado = numero* numero; 
		numeroCubo = numeroCuadrado* numero;
		System.out.printf("%5s %10s %12s\n", numero, numeroCuadrado, numeroCubo);
	}
  }
}
		

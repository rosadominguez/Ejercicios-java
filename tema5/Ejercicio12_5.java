public class Ejercicio12_5 {
  public static void main(String [] args) {
  
   System.out.println("Fibonacci");
   
    int ultimo;
    int numero1 = 0;
    int numero2 = 1;
    int numero3 = 0;
    
  System.out.println("Introduce el numero entero en el que quieras que acabe la serie de Fibonacci");
   ultimo = Integer.parseInt(System.console().readLine());
   
   while (ultimo >= numero3) {
	   
	   numero1 = numero3;
	   numero3 = numero1 + numero2;
	   numero2 = numero1;
	  
	   System.out.println(numero1);
   }
  }
}
   

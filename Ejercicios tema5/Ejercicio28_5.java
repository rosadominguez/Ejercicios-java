public class Ejercicio28_5 {
  public static void main(String [] args) {
  
    System.out.println("Este programa va a decir el factorial del numero introducido por teclado");
    
    int numero;
    int multiplicacion = 1;
    
    System.out.println("Introduzca un numero:");
    numero = Integer.parseInt(System.console().readLine());
    System.out.print(numero + ("! = "));
    
    while (0 < numero){
		multiplicacion = multiplicacion * numero;
		numero--;
	}
	
	System.out.print(multiplicacion);
  }
 }

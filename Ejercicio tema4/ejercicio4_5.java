public class ejercicio4_5 {
  public static void main(String [] args) {
	  
	  System.out.println("Este programa va a calcular una ecuacion de primer grado ( ax + b = 0");
	  
	  double a;
	  double b;
	  
	  System.out.println("Introduzca el valor a: ");
	  a = Double.parseDouble(System.console().readLine());
	  
	  System.out.println("Introduzca el valor b: ");
	  b = Double.parseDouble(System.console().readLine());
	  
	  double x;
	  x = -b/a;
	  
	  System.out.println("El valor de X es igual a: " + x);
	  
  }
}
	  

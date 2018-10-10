public class Ejercicio14_5 {
  public static void main(String [] args) {
  
     System.out.println("Pedir una base y un exponente");
      int base;
      int exponente;
      int solucion = 1;
      
      System.out.println("Introduzca la base (nº entero): ");
      base = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduzca el exponente (nº entero): ");
      exponente = Integer.parseInt(System.console().readLine());
      
     for (int i = 1; i <= exponente; i++){
		 solucion = solucion * base;
	  }
	  
	  System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + solucion);
	  
	}
}
      

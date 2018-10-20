public class Ejercicio15_5 {
  public static void main(String [] args) {
  
  System.out.println("Dado una base y un exponente que muestre base y exponentes de 1 al numero dado");
  
      int base;
      int exponente;
      int numero = 1;
      int resultado = 1;
  
          System.out.println("Por favor, introduzca la base: ");
          base = Integer.parseInt(System.console().readLine());
          System.out.println("Por favor, introduzca el exponente: ");
          exponente = Integer.parseInt(System.console().readLine());
  
              while (numero <=exponente){
	                 resultado = resultado * base;
	                 System.out.println(base + "^" + numero+ " = " + resultado);
	                  numero++;
              }
     }
}
	  
	  

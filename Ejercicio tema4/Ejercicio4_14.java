public class Ejercicio4_14{
  public static void main(String [] args) {
  
  int numTec; // numero introducido por teclado
  System.out.println("Este programa te dice si un numero es par y ademas si es divisible entre 5");

  System.out.println("Introduzca un numero entero");
  numTec = Integer.parseInt(System.console().readLine());
  
   if ((numTec%2) == 0) {
      System.out.println("El numero es par");
   }else{ 
      System.out.println("El numero es impar");
   }
   if ((numTec%5) == 0) {
      System.out.println("El numero es divisible entre 5");
      }else{
      System.out.println("El numero no es divisible entre 5");
      }
    }
 }
      
   

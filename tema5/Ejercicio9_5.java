public class Ejercicio9_5 {
  public static void main(String [] args) {
  
     System.out.println("Este programa dira cuantos digitos tiene un número introducido por teclado");
     
     long numero;
     long dividendo = 1;
     int contador=0;
     
     System.out.println("Introduzca un numero entero,de cuantas cifras quieras");
     numero = Integer.parseInt(System.console().readLine());
     
     
      while (numero >= dividendo) {
		 dividendo = dividendo*10;
		 contador++;
     }
     
     System.out.println("El numero que has introducido tiene " + contador + " cifras");
     
   }
 }

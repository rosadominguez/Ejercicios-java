public class Ejercicio19_4 {
  public static void main(String [] args) {

  System.out.println("Este programa dira cuantas cifras tiene el numero introducido");
  
  int numero;
  
  System.out.println("Por favor, introduzca el numero que desee de maximo 5 cifras (puede ser negativo o positivo)");
  numero = Integer.parseInt(System.console().readLine());
  
  if (numero >= 0) {
  if ( numero < 10) {
	  System.out.println("El numero tiene una cifra");
  }else if (( numero >= 10) && ( numero < 99)) {
	  System.out.println("El numero tiene dos cifras");
  }else if (( numero >= 100) && ( numero < 999)) {
	  System.out.println("El numero tiene tres cifras");
  }else if (( numero >= 1000) && ( numero < 9999)) {
	  System.out.println("El numero tiene cuatro cifras");
  }else if (( numero >= 10000) && ( numero < 99999)) {
	  System.out.println("El numero tiene cinco cifras");
  }
  }
  
  if (numero < 0) {
  if ( numero > -10) {
	  System.out.println("El numero tiene una cifra");
  }else if (( numero <= -10) && ( numero > -99)) {
	  System.out.println("El numero tiene dos cifras");
  }else if (( numero <= -100) && ( numero > -999)) {
	  System.out.println("El numero tiene tres cifras");
  }else if (( numero <= -1000) && ( numero > -9999)) {
	  System.out.println("El numero tiene cuatro cifras");
  }else if (( numero <= -10000) && ( numero > -99999)) {
	  System.out.println("El numero tiene cinco cifras");
  }
  }
 }
}
  

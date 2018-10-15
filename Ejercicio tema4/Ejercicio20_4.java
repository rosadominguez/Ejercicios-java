public class Ejercicio20_4 {
  public static void main(String [] args) {

  System.out.println("Este programa dira si el numero introducido es capicua");
  
  int numero;
  
     System.out.println("Por favor, introduzca el numero que desee de maximo 5 cifras");
     numero = Integer.parseInt(System.console().readLine());
  
 
      if ((( numero > 10) && ( numero < 99)) && ((numero/10) == (numero%1))) {
     	  System.out.println("El numero es capicua");
      }else if ((( numero > 10) && ( numero < 99)) && ((numero/10) != (numero%1))) {
		  System.out.println("El numero no es capicua");
	  }
      if ((( numero > 100) && ( numero <= 999)) && ((numero/100) == (numero%10))) {
    	  System.out.println("El numero es capicua");
      }else if ((( numero > 100) && ( numero < 999)) && ((numero/100) != (numero%10))) {
		  System.out.println("El numero no es capicua");
	  }
			  
      if ((( numero > 1000) && ( numero <= 9999)) && ((numero/1000) == (numero%100))){
    	  System.out.println("El numero es capicua");
      }else if ((( numero > 10000) && ( numero < 9999)) && ((numero/1000) != (numero%100))) {
		  System.out.println("El numero no es capicua");
	  }
      if ((( numero > 10000) && ( numero <= 99999)) && ((numero/10000) == (numero%1000))){
    	  System.out.println("El numero es capicua");
      }else if ((( numero > 10000) && ( numero < 9999)) && ((numero/10000) != (numero%1000))) {
		  System.out.println("El numero no es capicua");
      }    
 }
}

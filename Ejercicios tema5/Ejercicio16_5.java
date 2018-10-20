public class Ejercicio16_5 {
  public static void main(String[] args){
  
     System.out.println("Este programa dira si el numero introducido es par o impar");
     
     int numero;
     boolean esPrimo = true;
     
     
     System.out.println("Por favor,introduzca un numero: ");
     numero = Integer.parseInt(System.console().readLine());
     
    for (int i = 2;i < numero; i++ ) {
	 if (numero%i == 0) {
		 esPrimo = false;
		}
	  }
     if (esPrimo == true) {
		 System.out.println("El numero " + numero + " es primo.");
	 }else if (esPrimo == false) { 
		 System.out.println("El numero " + numero + " no es primo.");
	 }
  }
}


public class Ejercicio21_5 {
  public static void main(String [] args) {
    System.out.println("Este programa hara la media de los impares y dira el mayor de los pares introducidos,hasta numero negativo");
    
    
    int numero = 0;
    int impar = 0;
    int aux = 0;
    int suma = 0;
    int numero1 = 0;
    int contador =0;
    
    System.out.println("Introduzca un numero,cuando quiera que el programa pare introduzca un numero negativo");
    numero = Integer.parseInt(System.console().readLine());
    
   do {
 
        if (( numero > aux) && (numero % 2 == 0 )) {
		  numero1= numero;
		  aux = numero1;
	  }else if ((numero % 2 != 0) && (numero > 0)) {
		  impar++;
		  suma = (suma + numero)/impar;
		  
	 }
	 contador++;
	 System.out.println("Introduzca un numero,cuando quiera que el programa pare introduzca un numero negativo");
     numero = Integer.parseInt(System.console().readLine());

	}  while (numero >= 0);
	 
	 System.out.println("El numero de los impares es: " + impar + " y la media es: " + suma);
	 System.out.println("El numero de los pares es: " + (contador - impar) + " y el mayor de los pares es: " + aux);
	 
 }
}

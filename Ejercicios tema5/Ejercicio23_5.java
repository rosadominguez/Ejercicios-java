public class Ejercicio23_5 {
  public static void main(String [] args) {
	
		//Escribe un programa que permita ir introduciendo una serie indeterminada
			//de números mientras su suma no supere el valor 10000. Cuando esto último
			//ocurra, se debe mostrar el total acumulado, el contador de los números
			//introducidos y la media.
			
       int numero= 0;
       int suma = 0;
       int contador = 0;
       
       System.out.println("Por favor, introduzca numeros pulsando intro para separar");
       
       while(suma <= 10000){
       
       numero = Integer.parseInt(System.console().readLine());
       suma = suma + numero;
       contador++;
       
       }
       
       int media = suma/contador;
       
       if (suma > 10000){
		   System.out.println("El ultimo numero sobrepasa los 10.000,la suma hasta el anterior es " + ((suma - numero) + " los numero introducidos son " + (contador - 1) + " y la media " + (suma - numero) / (contador - 1)));
	   }else{
       System.out.println("El total de numero introducidos es " + contador + " la suma es " + suma + " y la media "+ media);
       }
  }
}
       

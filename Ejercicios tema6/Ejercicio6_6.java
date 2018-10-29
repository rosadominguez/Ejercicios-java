public class Ejercicio6_6 {
  public static void main(String [] args){
  
	//Escribe un programa que piense un número al azar entre 0 y 100. El usuario
	//debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
	//fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
	//es menor o mayor que el número secreto.
	
	int numero;
	int numeroIntroducido = 0;

	System.out.println("Adivina el numero!!");
	numero = (int)(Math.random()*100);
	System.out.println(numero);
	
	
	for (int i = 0; ((numero != numeroIntroducido) && (i<5));i++){
		
		 numeroIntroducido = Integer.parseInt(System.console().readLine());
		
		if (numero== numeroIntroducido){
			System.out.println("Muy bien has acertado el numero");
		}else if (numero < numeroIntroducido){
			System.out.println("El numero es mas pequeño");
		}else if (numero > numeroIntroducido){
		    System.out.println("El numero es mayor");
		}
		if (i == 4){
		    System.out.println("Lo siento, no lo has adivinado");
	    }
	   }
   }
}
	
		
	
	     

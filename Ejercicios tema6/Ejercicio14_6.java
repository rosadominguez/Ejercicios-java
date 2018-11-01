public class Ejercicio14_6 {
  public static void main(String [] args) {
  

	//Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
	//El programa intentará adivinar el número que estás pensando - un número
	//entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
	//programa debe preguntar si el número que estás pensando es mayor o menor
	//que el que te acaba de decir.
	
		System.out.println("Vamos a adivinar el numero que estas pensando");
		int numero;
		String respuesta = " ";
		String respuesta2 = " ";
		int contador = 0;
		int minimo= 0;
		int maximo = 100;
	  
		do{
			numero = (int)(Math.random()*(maximo-minimo)+ minimo);
			System.out.println(numero);
	  
			System.out.println("Indica si el numero introducido es el tuyo");
			respuesta = System.console().readLine();
	  
			if ( respuesta.equals("si")){
				System.out.println("El numero a adivinar es " + numero);
			}else {
				System.out.println("Indica si es mayor o menor");
				respuesta2 = System.console().readLine();	 
			if (respuesta2.equals("mayor")){
				minimo = numero+1;
			}else if (respuesta2.equals("menor")){
			  maximo = numero-1;
			} 
		}
		    contador++;
      
		}while ((!"si".equals(respuesta))&&(contador != 5));
      
		if((contador==5)&&(respuesta.equals("no"))){
		  System.out.println("Lo siento no lo he adivinado");
		}  
	}
}


		  
		  

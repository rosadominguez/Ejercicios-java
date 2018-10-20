public class Ejercicio26_5 {
  public static void main(String [] args) {
  
  //Realiza un programa que pida primero un número y a continuación un dígito.
  //El programa nos debe dar la posición (o posiciones) contando de izquierda a
  //derecha que ocupa ese dígito en el número introducido.
  
    int numero;
    int digito;
    int resto = 0;
    int contador = 1;
  
      System.out.println("Por favor, introduzca un numero entero");
        numero = Integer.parseInt(System.console().readLine());
      System.out.println("Introduzca el digito que quiere conocer");
        digito = Integer.parseInt(System.console().readLine());
      System.out.print("La posicion del numero " + numero + " es ");
  
          while (0 < numero){
			  
             while( 0 < numero) {
				resto = (resto*10) + (numero%10);
				numero = numero/10;
			}
				while (resto > 0) {
			    if((resto%10) == digito){
			    System.out.print(contador +  ".");
			}
				resto= resto/10;
				contador++;
			 
			}
		}	
		System.out.println();
	}
}


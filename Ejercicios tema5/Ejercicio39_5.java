public class Ejercicio39_5{
  public static void main(String [] args){
  
  
	//Escribe un programa que pida un número entero positivo por teclado y que
	//muestre a continuación los números desde el 1 al número introducido junto
	//con su factorial.
	
		int numeroIntroducido ;
  
		System.out.println("Por favor introduzca un numero entero positivo");
		numeroIntroducido = Integer.parseInt(System.console().readLine());
  
			int numero = numeroIntroducido;
			int factorial = 1;
			int i = 1;
	
			while (1 <= numeroIntroducido){
					
				while( i <= numero){
					factorial = factorial * i;
					System.out.println(i + "! = " + factorial);
				i++;	
				}
		
			numeroIntroducido--;
			}
	}
}

	   

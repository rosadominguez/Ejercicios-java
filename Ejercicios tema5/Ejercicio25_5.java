public class Ejercicio25_5 {
  public static void main(String [] args) {
  
	//Realiza un programa que pida un número por teclado y que luego muestre ese
	//número al revés.
		
	int numero;
	int resto =0;
  
		System.out.println("Por favor, introduzca un numero:");
		numero = Integer.parseInt(System.console().readLine());
       
		System.out.print("El numero al reves es: ");
       
			while( 0 < numero) {
		   
				resto = numero%10;
				numero = numero/10;
				System.out.print(resto);
			}
	   
   }
}
		   
  

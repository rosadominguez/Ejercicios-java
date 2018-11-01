public class Ejercicio9_6 {
  public static void main(String [] args){
  

	//Realiza un programa que vaya generando números aleatorios pares entre 0
	//y 100 y que no termine de generar números hasta que no saque el 24. El
	//programa deberá decir al final cuántos números se han generado.
	
	System.out.println("Vamos a generar numero pares hasta que salga el 24");
	
		int numero = 0;
		int contador = 0;
	
			while ( numero != 24){
		
			numero = (int)(Math.random()*100);
		
				if( numero%2 == 0){
				System.out.println(numero);
				contador++;
				}	
			}
		System.out.println("Se han generado " + contador + " numeros");
	}
}
		

public class Ejercicio2_6 {
  public static void main(String [] args) {
  
	//Realiza un programa que muestre al azar el nombre de una carta de la
		//baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
		//diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
		//cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
		//sería el 1). Para convertir un número en una cadena de caracteres podemos
		//usar String.valueOf(n).
		
		System.out.println("Vamos a mostrar una carta al azar!!");
		
		String carta = " ";
		String numero = " ";
		
		int num = (int)(Math.random()*13) + 1;
		
		switch (num){
				
			case 1 :
			numero = "AS";
			break;
			
			case 11 :
			numero = "J";
			break;
			
			case 12 :
			numero = "Q";
			break;
			
			case 13 :
			numero = "K";
			break;
			default:
			numero = String.valueOf(num);
			
	    }
		
		int palo = (int)(Math.random()*4) + 1;
		
		switch (palo){
			
			case 1 :
			 carta = "Picas";
			break;
			
			case 2 :
			carta = "Corazones";
			break;
			
			case 3 :
			carta = "Diamantes";
			break;
			
			case 4 :
			carta = "Trebol";
			break;
		}
	  System.out.println(numero + " de " + carta);
  }
}
		

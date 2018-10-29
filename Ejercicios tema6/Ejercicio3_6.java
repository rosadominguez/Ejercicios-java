public class Ejercicio3_6 {
  public static void main(String [] args){
  
	//Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
	//de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
	
			System.out.println("Vamos a mostrar una carta al azar de la baraja Española!!");
		
		String carta = " ";
		String numero = " ";
		
		int num = (int)(Math.random()*10) + 1;
		
		switch (num){
			
			case 8 :
			numero = "Sota";
			break;
			
			case 9 :
			numero = "Caballo";
			break;
			
			case 10 :
			numero = "Rey";
			break;
			default:
			numero = String.valueOf(num);
			
	    }
		
		int palo = (int)(Math.random()*4) + 1;
		
		switch (palo){
			
			case 1 :
			 carta = "Copas";
			break;
			
			case 2 :
			carta = "Espadas";
			break;
			
			case 3 :
			carta = "Bastos";
			break;
			
			case 4 :
			carta = "Oro";
			break;
		}
	  System.out.println(numero + " de " + carta);
  }
}
	

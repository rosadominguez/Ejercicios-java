public class Ejercicio13_6 {
  public static void main(String [] args) {
  
	//Escribe un programa que simule la tirada de dos dados. El programa deberá
	//continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
	//dados tengan el mismo valor.
	
	System.out.println("Realizamos tiradas de dos hasta que sean iguales");
	
	int tirada1 = 1;
	int tirada2 = 2;
	
	    while (tirada1 != tirada2){
		
		tirada1 = ((int)(Math.random()*6)+1);
		tirada2 = ((int)(Math.random()*6)+1);
		
		System.out.print(tirada1 + " - ");
		System.out.println(tirada2);
		
	    }
	}
}

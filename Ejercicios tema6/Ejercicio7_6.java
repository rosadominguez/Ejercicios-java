public class Ejercicio7_6{
  public static void main(String [] args){
  
	//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
	//para los 14 partidos y el pleno al quince (15 filas).
	
	System.out.println("Vamos a rellenar una quiniela");
	System.out.println(" ");
	System.out.println("Partidos      |1|x|2||1|x|2||1|x|2|");
	System.out.println(" ");
	int quiniela;
	String casilla = " ";
	

	for (int i = 1; i < 15; i++){
		
		for (int e = 0; e<3;e++){
			quiniela = (int)(Math.random()*3)+1;
	  
		switch (quiniela){
	
			case 1:
			casilla = "|x| | |";
			break;
		
			case 2:
			casilla = "| |x| |";
			break;
		
			case 3:
			casilla = "| | |x|";
			break;
		}
			if (e == 0){
				System.out.print("Partido  " + i + " -- " +casilla);
			}else{
				System.out.print(casilla);
			}
		}		

			System.out.println(" ");
	}
	
		for (int e = 0; e<3;e++){
			quiniela = (int)(Math.random()*3)+1;
	  
			switch (quiniela){
	
				case 1:
				casilla = "|x| | |";
				break;
		
				case 2:
				casilla = "| |x| |";
				break;
		
				case 3:
				casilla = "| | |x|";
				break;
			}
	    
			if (e == 0){
				System.out.print("Pleno al 15 -- " +casilla);
			}else{
				System.out.print(casilla);
		
			}
	
		}		

	}
}

	
	

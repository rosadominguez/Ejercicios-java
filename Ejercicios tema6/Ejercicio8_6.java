public class Ejercicio8_6{
  public static void main(String [] args){


	//Modifica el programa anterior para que la probabilidad de que salga un 1 sea
	//de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
	//2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
	
	System.out.println("Vamos a rellenar una quiniela");
	System.out.println(" ");
	System.out.println("Partidos      |1|x|2||1|x|2||1|x|2|");
	System.out.println(" ");
	int quiniela;
	String casilla = " ";
	

	for (int i = 1; i < 15; i++){
		
		for (int e = 0; e<3;e++){
			quiniela = (int)(Math.random()*6)+1;
	  
		switch (quiniela){
	
			case 1:
			casilla = "|x| | |";
			break;
		
			case 2:
			casilla = "|x| | |";
			break;
		
			case 3:
			casilla = "|x| | |";
			break;
		
			case 4:
			casilla = "| |x| |";
			break;
			
			case 5:
			casilla = "| |x| |";
			break;
		
			case 6:
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
			quiniela = (int)(Math.random()*6)+1;
	  
		switch (quiniela){
	
			case 1:
			casilla = "|x| | |";
			break;
		
			case 2:
			casilla = "|x| | |";
			break;
		
			case 3:
			casilla = "|x| | |";
			break;
		
			case 4:
			casilla = "| |x| |";
			break;
		
			case 5:
			casilla = "| |x| |";
			break;
		
			case 6:
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


public class Ejercicio15_6 {
  public static void main(String [] args) {
  
	//Realiza un generador de melodía con las siguientes condiciones:
	//a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
	//sol, la y si.
	//b) Una melodía está formada por un número aleatorio de notas mayor o igual
	//a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
	//c) Cada grupo de 4 notas será un compás y estará separado del siguiente
	//compás mediante la barra vertical. El final de la melodía se marca
	//con dos barras.
	//d) La última nota de la melodía debe coincidir con la primera.
	
	System.out.println("Vamos a crear una melodia");
	
		int notas = 4 * (int)(Math.random() * 7 + 1);
		int numero;
		String nota = " ";
		int contador = 0;
		String nota2 = " ";
	
		for(int i = 0; (i < notas - 1); i++){
		
			numero =(int)(Math.random()*7)+ 1;
			
		
		switch (numero) {
			
			case 1:
			nota = " do ";
			break;
			
			case 2:
			nota = " re ";
			break;
			
			case 3:
			nota = " mi ";
			break;
			
			case 4:
			nota = " fa ";
			break;
			
			case 5:
			nota = " sol ";
			break;
			
			case 6:
			nota = " la ";
			break;
			
			case 7:
			nota = " si ";
			break;
			
		}
			System.out.print(nota);
			contador++;
		
			if(i == 0){
				nota2 = nota;
			}
		
			if(i == (notas - 2)){
				nota = nota2;
				System.out.print(nota2 + "|");
		    }
			if(contador==4){
				System.out.print("|");
				contador = 0;
			}
		
		
		}
			System.out.println(" ");
	}
}

		
		
			
		
		

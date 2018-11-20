public class Ejercicio16_7{
  public static void main(String [] args){
  
	//Escribe un programa que rellene un array de 20 elementos con números enteros
	//aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
	//el programa mostrará el array y preguntará si el usuario quiere resaltar los
	//múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
	//array escribiendo los números que se quieren resaltar entre corchetes.
	
	System.out.println("Mostrar los multiplos de 5 o de 7");
	
	int [] numeros= new int [20];
	int respuesta;
	
		for (int i = 0; i <20;i++){
		
			numeros[i] = (int)(Math.random()*401);
			System.out.print(numeros[i] + " ");
		}
			System.out.println(" ");
	
		System.out.println("¿Que numeros quieres que resalte?,indica con un 5 o un 7 segundo quieras los multiplos.");
		respuesta = Integer.parseInt(System.console().readLine());
	
		switch (respuesta){
		
			case 5:
		
				for(int i = 0; i<20;i++){	
					if(numeros[i]%5 == 0){
						System.out.print("[" + numeros[i] + "] ");
					}else{
					System.out.print(numeros[i] + " ");
					}
				}
			break;
		
			case 7:
		
				for(int i = 0; i<20;i++){	
					if(numeros[i]%7 == 0){
						System.out.print("[" + numeros[i] + "] ");
					}else{
						System.out.print(numeros[i] + " ");
					}
				}
			break;
		}
	
	}
}

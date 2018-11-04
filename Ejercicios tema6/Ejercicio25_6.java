public class Ejercicio25_6 {
  public static void main(String [] args){
  
	//Escribe un programa que muestre por pantalla 100 números enteros separados
	//por un espacio. Los números deben estar generados de forma aleatoria
	//en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
	//almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
	
	System.out.println("Vamos a generar numeros aleatorios");
	
	int numero;
	int contador=0;
	
	
		for(int i = 0;i < 100;i++){
			
			numero = (int)(Math.random()*191)+10;
			boolean esPrimo = true;
			contador++;
			
			for(int p = 2;p < numero;p++){
				if((numero%p) == 0){
					esPrimo = false;
				}
			}
				
				if(esPrimo){
					System.out.print("#" + numero + "# ");
				}else if(numero%5 == 0){
					System.out.print("[" + numero + "] ");
				}else {
					System.out.print(numero +" ");
				}
		}
	
			System.out.println(" ");
			System.out.print("contador" +contador);
	} 
}
	
	
	
	

public class Ejercicio19_6 {
  public static void main(String [] args) {
  
	//Escribe un programa que muestre 50 números enteros aleatorios comprendidos
	//entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
	//luego el máximo de los pares el mínimo de los impares y la media de todos los
	//números generados.
	
	int numero;
	int suma = 0;
	int mayorPar = -100; 
	int menorImpar = 200;
	
		System.out.println("Vamos a elegir 50 numeros aleatorios");
	
			for (int i = 0; i < 50; i++){
		
				numero = (int)(Math.random()*301)-100;
	
				suma = suma + numero;
	
				if (numero%2 == 0){
		
					if(numero > mayorPar){
					   mayorPar = numero;
					}
		
				}else if(numero<menorImpar){
						menorImpar = numero;
				}
			}
				System.out.println("El numero par mayor es " + mayorPar + " el menor impar es " + menorImpar + " la media de los numeros es " + (suma/50) + ".");

	}
}


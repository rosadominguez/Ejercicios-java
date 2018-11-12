public class Ejercicio10_7 {
  public static void main(String [] args){
  
	//Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
	//y que los almacene en un array. El programa debe ser capaz de pasar todos
	//los números pares a las primeras posiciones del array (del 0 en adelante) y
	//todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
	//es necesario.
	
	System.out.println("Numeros pares y luego impares");
	
	int [] numeros = new int[20];
	int [] par = new int[20];
	int [] impar = new int[20];
	int i;
	int p = 0;
	int im = 0;
	
		for (i = 0; i<20;i++){
		
			numeros[i] = (int)(Math.random()*100);
		}
		
			for(i = 0; i < 20;i++){
		
				if(numeros[i]%2 == 0){
					par[p++] = numeros[i];
				}else{
					impar[im++] = numeros[i];
				}
			}
			
			for(i = 0;i<20;i++){
				System.out.print(" " + numeros[i]);
			}
			
			System.out.println(" ");
			
			for(i = 0; i < p;i++){
				numeros[i] = par[i];
			}
			for(i = p;i<20;i++){
				numeros[i] = impar[i - p];
			}
			
			for(i =0; i<20;i++){
				System.out.print(numeros[i] + " ");
			}
			System.out.println(" ");
	}
}

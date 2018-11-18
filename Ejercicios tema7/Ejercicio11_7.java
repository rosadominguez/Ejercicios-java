public class Ejercicio11_7 {
  public static void main(String [] args){
  
	//Realiza un programa que pida 10 números por teclado y que los almacene en
	//un array. A continuación se mostrará el contenido de ese array junto al índice
	//(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
	//primos a las primeras posiciones, desplazando el resto de números (los que
	//no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
	//el array resultante.
	
	System.out.println("Numeros primos delante,detrás los demás");
	
	int [] numeros = new int[10];
	
	
	System.out.println("Por favor, introduzca 10 numeros enteros");
	
		for(int i =0;i<10;i++){
			numeros[i] = Integer.parseInt(System.console().readLine());
		}
		for(int i = 0;i<10;i++){
			System.out.print(" | " + i + " | ");
		}
	System.out.println(" ");
	System.out.println("---------------------------------------------------------------------");
	
		for(int i = 0;i<10;i++){
			System.out.print(" | " + numeros[i] + " | ");
		}
	System.out.println(" ");
	System.out.println("*********************************************************************");
	
	int [] primos = new int[10];
	int [] noPrimos = new int [10];
	int pri = 0;
	int noPri = 0;
	
	for(int i = 0;i<10;i++){
		boolean esPrimo = true;
			for(int j = 2;(j<=(numeros[i]/2))&& esPrimo;j++){
				if (numeros[i]%j==0){
					esPrimo = false;
				}
			}
				if(esPrimo){
					primos[pri] = numeros[i];
					pri++;
				}else{
					noPrimos[noPri] = numeros[i];
					noPri++;
				}
	}
		for(int i = 0;i<pri;i++){
		
			numeros[i] = primos[i];
		}
		for(int i = 0;i<noPri;i++){
			numeros[pri + i] = noPrimos[i];
		}
		for(int i = 0;i<10;i++){
			System.out.print(" | " + i + " | ");
		}
	System.out.println(" ");
	System.out.println("---------------------------------------------------------------------");
	
		for(int i = 0;i<10;i++){
			System.out.print(" | " + numeros[i] + " | ");
		}		
		
	}
}

package arrays;

public class funciones{

	public static int [] generaArrayInt(int tam){
		
		/* Genera un array de tamaño n con números aleatorios
cuyo intervalo (mínimo y máximo) se indica como parámetro */
	
	int [] generaArray = new int [tam];

	for (int i = 0; i < tam; i++){
		generaArray[i] = (int)(Math.random()*100);
	}
	for(int i = 0; i< tam;i++){
		System.out.println(i + "=" + generaArray[i]);
	}
	return generaArray;
}

   /* minimoArrayInt: Devuelve el mínimo del array que se pasa como
parámetro*/

	public static int minimoArrayInt(int [] array){
		int menor = 100;
		
		for(int i = 0; i < array.length;i++){
			if( array[i] < menor){
				menor = array[i];
			}
		}
		return menor;
}
	/*maximoArrayInt: Devuelve el máximo del array que se pasa como
	parámetro.*/
	
	public static int maximoArrayInt(int [] array){
		int mayor = 0;
		
		for(int i = 0; i < array.length;i++){
			if( array[i] > mayor){
				mayor = array[i];
			}
		}
		return mayor;
}	
	/*mediaArrayInt: Devuelve la media del array que se pasa como parámetro*/
	
	public static int mediaArrayInt(int [] array){
		
		int suma = 0;
		int media = 0;
		
		for (int i = 0; i < array.length;i++){
			suma = suma + array[i];
		}
		media = suma / array.length;
		return media;
	}
	/*estaEnArrayInt: Dice si un número está o no dentro de un array*/
	
	public static boolean estaEnArrayInt(int [] array){
		
		int num;
		
		System.out.println("Dígame un numero");
		num = Integer.parseInt(System.console().readLine());
		
		for (int i = 0; i < array.length;i++){
			if(array[i] == num){
				return true;
			}
		}
		return false;
	}
}

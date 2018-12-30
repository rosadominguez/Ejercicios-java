import arrays.funciones;

public class Ejercicios{
	public static void main(String [] args){
		int [] array;
		int numero;
		
		System.out.println("Introduzca el tamaño del array");
		numero = Integer.parseInt(System.console().readLine());
		array = funciones.generaArrayInt(numero);
		System.out.println("Numero minimo del array");
		System.out.println(funciones.minimoArrayInt(array));
		System.out.println("Numero maximo del array");
		System.out.println(funciones.maximoArrayInt(array));
		System.out.println("Media del array");
		System.out.println(funciones.mediaArrayInt(array));
		if(arrays.funciones.estaEnArrayInt(array)){
			System.out.println("Si esta en el array");
		}else{
			System.out.println("No esta en el array");
	}
}
}
		

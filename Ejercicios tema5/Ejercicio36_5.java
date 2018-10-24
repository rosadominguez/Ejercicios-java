public class Ejercicio36_5 {
  public static void main(String [] args){
  
	//Escribe un programa que diga si un número introducido por teclado es o no
	//capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
	//programa debe aceptar números de cualquier longitud siempre que lo permita
	//el tipo, en caso contrario el ejercicio no se dará por bueno.
	
		long numero;
	
		System.out.println("Por favor introduzca un  numero entero");
		numero = Long.parseLong(System.console().readLine());
	
			long num = numero;
			long mun1 = 0;
	
			while (0 < num){
				mun1 = (mun1*10) + (num%10);
				num = num/10;
			}
	 
				if ( mun1 == numero) {
					System.out.println("El numero introducido " + numero + " es capicua.");
				}else{
					System.out.println("El numero introducido " + numero + " NO es capicua.");
				}
	  }
} 
	

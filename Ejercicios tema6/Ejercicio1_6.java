public class Ejercicio1_6 {
  public static void main(String [] args) {
  
     //Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
     //también la suma total (los puntos que suman entre los tres dados).
     
     System.out.println("Muestra 3 numero aleatorios de un dado y su suma:");
     
		int tirada;
		int suma = 0;
     
		for (int i = 0; i <3; i++){
			tirada = ((int)(Math.random()*6)+1);
			System.out.print(tirada + " ");
			suma = suma + tirada;
		}
     
		System.out.println(" ");
		System.out.println("La suma de todos es: " + suma);
   }
}

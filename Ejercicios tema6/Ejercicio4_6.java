public class Ejercicio4_6 {
  public static void main(String [] args) {
  
	//Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
	//por espacios.
	
	System.out.println("Vamos a mostrar 20 numero aleatorios entre 0 y 10");
	
	int numeros;
	
		for(int i = 0;i < 20; i++){
			numeros = (int)(Math.random()*11);
			System.out.print(numeros + "  ");
		}
  }			
}

public class Ejercicio3_7 {
  public static void main(String [] args){
  
	//Escribe un programa que lea 10 números por teclado y que luego los muestre
	//en orden inverso, es decir, el primero que se introduce es el último en
	//mostrarse y viceversa.

	System.out.println("Vamos a mostrar numeros en orden inverso al introducido");
	
	int [] numIntro = new int[10];
	
	System.out.println("Por favor, introduzca diez numero,utilice intro para separarlos");
	
		for(int i = 0;i<10;i++){
			numIntro[i] = Integer.parseInt(System.console().readLine());
		}
		
		System.out.print("Los numeros introducidos son: ");
		
		for(int i = 9;i>=0;i--){
			System.out.print(numIntro[i] + " ");
		}
		
	}
}
	
	
	
	
	
	

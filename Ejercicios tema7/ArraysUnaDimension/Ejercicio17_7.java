public class Ejercicio17_7 {
  public static void main(String [] args){
  
	//Escribe un programa que muestre por pantalla un array de 10 números enteros
	//generados al azar entre 0 y 100. A continuación, el programa debe pedir
	//un número al usuario. Se debe comprobar que el número introducido por
	//teclado se encuentra dentro del array, en caso contrario se mostrará un
	//mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
	//introduzca uno correctamente. A continuación, el programa rotará el array
	//hacia la derecha las veces que haga falta hasta que el número introducido
	//quede situado en la posición 0 del array. Por último, se mostrará el array rotado
	//por pantalla.
	
	int[]numero = new int[10];
	int num;
	boolean igual = false;
	int aux = 0;
	
	System.out.println("Colocamos el numero el primero");
	
		for(int i = 0; i < 10;i++){
			numero[i] = (int)(Math.random()*101);
			System.out.print(numero[i] + " ");
		}
			System.out.println(" ");
	
		do{
		
			System.out.println("Dime un numero del 0 al 100");
			num= Integer.parseInt(System.console().readLine());
	
	
			for (int i = 0;i<10;i++){
		
				if(numero[i] == num){
					igual = true;
				}
			}	
			
			if(!igual){
				System.out.println("Ese numero no esta en el array");
			}
					
		}while(igual == false);
	
		while(numero[0] != num){
	
			int auxi = numero[9];
	
			for(int i = 9; i>0;i--){
		
				numero[i] = numero[i-1];
			}
			numero[0] = auxi;
			}
			
		for (int i = 0;i<10;i++){
			System.out.print(numero[i] + " ");
		}

	}
}
		
	
	
	
	

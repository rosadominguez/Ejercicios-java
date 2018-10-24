public class Ejercicio40_5 {
  public static void main(String [] args) {
  
    //Realiza un programa que pinte por pantalla un rombo hueco hecho con
	//asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
	//sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
	//mensaje de error.
	
	
	int altura;
	
	System.out.println("Por favor, introduzca la altura (numero impar mayor o igual a 3)");
	altura = Integer.parseInt(System.console().readLine());
	
		int espacio = altura/2;
		int espacio2 = altura/2;
		int espacio3 = 1;
		int contador = 0;
	
		if ((altura>=3) && (altura%2 != 0)) {
		for(int i = 0;i <= espacio;i++){
			System.out.print(" ");
		}
			System.out.println("*");
	
		for (int i = 0;i < espacio - 1; i++){
		
			for (int j = 0; j<espacio2; j++){
				System.out.print(" ");
			}
				System.out.print("*");
	    
			for (int  c = 0;c <espacio3; c++){
				System.out.print(" ");
			}
				System.out.print("*");
				System.out.println(" ");
	     	
			espacio2--;
			espacio3+=2;
	  
		}
		for (int i = 0;i < espacio; i++){
		
			for (int j = 0; j<espacio2; j++){
				System.out.print(" ");
			}
				System.out.print("*");
	    
			for (int  c = 0;c <espacio3; c++){
				System.out.print(" ");
			}
				System.out.print("*");
				System.out.println(" ");
	     	
			espacio2++;
			espacio3-=2;
			}
			for(int i = 0;i <= espacio;i++){
				System.out.print(" ");
			}
				System.out.println("*");
			}else{
	  
				System.out.println("ERROR");
			}
	}
}

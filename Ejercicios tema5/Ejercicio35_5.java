public class Ejercicio35_5 {
  public static void main(String [] args) {
  
	//Realiza un programa que pinte una X hecha de asteriscos. El programa debe
    //pedir la altura. Se debe comprobar que la altura sea un número impar mayor
	//o igual a 3, en caso contrario se debe mostrar un mensaje de error.
	
	int altura;
	
	System.out.println("Por favor, introduzca la altura: ");
	altura = Integer.parseInt(System.console().readLine());
	
	int contador = 1;
	int espacios = (altura-2);
	
	for ( int i = 0; i < altura/2; i++) {
	
	     for (int j = 0; j < contador; j++){
	     System.out.print(" ");
	     }
	     System.out.print("*");
	     
	     for (int e = 0; e < espacios; e++){
	     System.out.print(" ");
	     }
	     
	     System.out.println("*");
	     
	 espacios-=2;
	 contador++;
    }
       for (int i = 0; i< ((altura/2) +1);i++){
			 System.out.print(" ");
	     }
	     
	     System.out.println("*");
	     
	  espacios = 1;
	  contador = contador - 1;
	     
	   for (int i = 0; i < (altura/2);i++){
		 
	     
	     for(int j = 0; j< contador; j++) {
			 System.out.print(" ");
	     }
	     System.out.print("*");
	     
	      for (int j = 0; j < espacios; j++){
	     System.out.print(" ");
	     }
	     System.out.println("*");
	     
	  contador--;
	  espacios +=2;
	  
	 }
	 
  }
}


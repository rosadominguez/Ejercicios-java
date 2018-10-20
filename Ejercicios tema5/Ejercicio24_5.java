public class Ejercicio24_5 {
  public static void main(String [] args){
  
      //Escribe un programa que lea un número n e imprima una pirámide de números
      //con n filas.
      
     int altura;
      
     System.out.println("Por favor introduzca la altura de la pirmaide");
     altura = Integer.parseInt(System.console().readLine());
     
      int contadorEspacios =altura-1;
      int contador = 1;
  
        while (contador<=altura){
		 
		 for (int e = 0;e <= contadorEspacios;e++){
			 System.out.print(" ");
		 }
		  
		 for (int n =1; n < contador; n++) {
			 System.out.print(n);
	     }
	     for (int m =contador; m >0; m--) {
			 System.out.print(m);
	     }

          System.out.println(" ");
          
	     contadorEspacios--;
	     contador++;
     
	 }
  }
}

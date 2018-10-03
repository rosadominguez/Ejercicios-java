import java.util.Scanner;

public class ejercicio32 {
  public static void main(String[] args){
	  
	  System.out.println("Cambie de euros a monedas");
	  
	  int numero1;
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("Introduzca los euros");
	  
	  numero1 = Integer.parseInt(escanerEntrada.nextLine());
	  
	   double x = 166.386;
	   
	  double resultado;
	   
	  resultado = numero1 * (double)x;
	  
	  System.out.println("son  " + resultado + "  pesetas");
	   
	}
}


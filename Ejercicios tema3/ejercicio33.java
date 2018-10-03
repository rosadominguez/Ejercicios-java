import java.util.Scanner;

public class ejercicio33 {
  public static void main(String[] args){
	  
	  System.out.println("Cambie de pesetas a euros");
	  
	  int numero1;
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("Introduzca las pesetas");
	  
	  numero1 = Integer.parseInt(escanerEntrada.nextLine());
	  
	  double x = 166.386;
	   
	  double resultado;
	   
	  resultado = numero1 / (double)x;
	  
	  System.out.println("son  " + resultado + "  euros");
	   
	}
}


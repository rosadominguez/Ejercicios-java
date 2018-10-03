import java.util.Scanner;

public class ejercicio31 {
  public static void main(String[] args){
	  
	  System.out.println("Este programa multiplica dos numeros");
	  
	  int numero1;
	  int numero2;
	  int resultado;
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("introduzca el primer numero:");
	  
	  numero1 = Integer.parseInt(escanerEntrada.nextLine());
	  
	  System.out.println("introduzca el segundo numero:");
	  
	  numero2 = Integer.parseInt(escanerEntrada.nextLine());
	  
	  resultado = numero1 * numero2;
	   
	  System.out.printf("%d * %d = %d\n", numero1,numero2,resultado);
	}
}


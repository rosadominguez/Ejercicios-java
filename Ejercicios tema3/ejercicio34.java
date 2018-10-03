import java.util.Scanner;

public class ejercicio34 {
  public static void main(String[] args){
	  
	  System.out.println("Operaciones entre numeros");
	  
	  double numero1;
	  double numero2;
	  double resultado1;
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("introduzca el primer numero:");
	  
	  numero1 = Integer.parseInt(escanerEntrada.nextLine());
	  
	  System.out.println("introduzca el segundo numero:");
	  
	  numero2 = Integer.parseInt(escanerEntrada.nextLine());
	  
	  resultado1 = numero1 + numero2;
	  
	  System.out.println("la suma de los numeros es  " + numero1 + " + "+numero2+" = "+resultado1); // numero + letras +  numeros +  letras
	  
	  double resultado2;
	  
	  resultado2 = numero1 - numero2;
	 
	  System.out.println("la resta de los numeros es  " + numero1 + " - "+ numero2 + " = " + resultado2);
	  
	  double resultado3;
	  
	  resultado3 = numero1 * numero2;
	 
	  System.out.println("la multiplicacion de los numeros es  " + numero1 + " * "+ numero2 + " = " + resultado3);
	  
	  double resultado4;
	  
	  resultado4 = numero1 / numero2;
	 
	  System.out.println("la division de los numeros es  " + numero1 + " / "+ numero2 + " = " + resultado4);
	  	 	 
	}
}


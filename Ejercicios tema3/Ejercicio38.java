 import java.util.Scanner;

 
 public class Ejercicio38 {
public static void main(String[] args){
	  
	  System.out.println("Vamos a calcular su salario a la semana");
	  
	  double horasTrabajadas;
	  double diasTrabajados;
	  double salarioSemanal;
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("Cuantas horas trabaja:");
	  
	  horasTrabajadas = Integer.parseInt(escanerEntrada.nextLine());
	  
	  System.out.println("Cuantos dias a la semana:");
	  
	  diasTrabajados = Integer.parseInt(escanerEntrada.nextLine());
	  
	  salarioSemanal = horasTrabajadas * diasTrabajados * 12;
	  
	  System.out.println(" Su salario semanal es:  " + salarioSemanal);
	 
 }
}

import java.util.Scanner;

public class ejercicio4_1 {
  public static void main(String[] args){
	  
	  System.out.println("Este programa te dira la primera asignatura de cada dia");
	  
	  String diaSem;
	  
	  Scanner s = new Scanner(System.in);
		
	  System.out.println("Asignatura del dia");
	  System.out.println("Introduzca el dia en minusculas");
		
	  diaSem = s.next();
	 
		
	  if (diaSem.equals("lunes")){
			System.out.println("Tu clase a primera hora es Sistemas Informaticos");		
	  }
	
	  if (diaSem.equals("martes")){
			System.out.printf("Tu clase a primera hora es Programacion");
	  }
	  if (diaSem.equals("miercoles")){
			System.out.printf("Tu clase a primera hora es Entorno de desarrollo");
	  }
	  if (diaSem.equals("jueves")){
			System.out.printf("Tu clase a primera hora es Lenguaje de marcas");
	  }
	  if (diaSem.equals("viernes")){
			System.out.printf("Tu clase a primera hora es Base de datos");
	  }
	}
}
		

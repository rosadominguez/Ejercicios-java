import java.util.Scanner;

public class Ejercicio4_2 {
  public static void main(String[] args){

	  Scanner s = new Scanner(System.in);
	    
	  System.out.println("Introduzca la hora");
	  
	   int hora = Integer.parseInt(s.nextLine());
	  
	  if ((6 <= hora) && (hora <= 12 )){
		 System.out.println(" Buenos dias!!");
	  }else if ((hora <= 20) && (hora >= 13)){
		  System.out.println(" Buenas tardes!!");
	  }else if ((hora >= 21) && (hora >= 0) ){
		  System.out.println(" Buenas noches!!");
	  }
  }
 }

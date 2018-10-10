import java.util.Scanner;

public class Ejercicio4_3 {
  public static void main(String[] args){

	  Scanner s = new Scanner(System.in);
	    
	  System.out.println("Introduzca el dia en numeros:");
	  
	   int dia = Integer.parseInt(s.nextLine());
	   
	  if(dia == 1) {
		  System.out.println( "Hoy es lunes :( ");
	  }else if (dia == 2) {
		  System.out.println("Hoy es martes");
	  }else if (dia == 3){
		  System.out.println("Hoy es miercoles");
	  }else if (dia == 4){
		  System.out.println("Hoy es jueves");
      }else if (dia == 5){
		  System.out.println("Hoy es viernes :)");
	  }else if (dia == 6){
          System.out.println("Hoy es sabadado =b ");
	  }else if (dia == 7){
		  System.out.println("Hoy es domingo");
	  }
  }
}

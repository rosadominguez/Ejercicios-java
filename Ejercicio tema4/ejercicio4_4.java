public class ejercicio4_4 {
  public static void main(String [] args) {
	   
	  int horas;
	  System.out.println("Este programa calcula tu salario segun tus horas trabajadas");
	  System.out.println("Introduzca el numero de horas trabajadas");
	 
	  horas = Integer.parseInt(System.console().readLine());
	  
	  if (horas <= 40) {
		 System.out.println("Su salario es: " + (horas * 12));
      }else if (horas > 40) {
		    System.out.println("Su salario es: " + (480 + ((horas - 40)* 16)));
	  }
	   
  }
}

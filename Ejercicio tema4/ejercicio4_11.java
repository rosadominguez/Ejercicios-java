public class ejercicio4_11 {
  public static void main(String [] args) {
	  
	  System.out.println("Este programa te dira cuantos segundos faltan para la media noche.");
	  
	  int hora;
	  int minutos;
	 
	  
	  System.out.println("Por favor, introduzca la hora: ");
	  
	  hora = Integer.parseInt(System.console().readLine());
	  
	  System.out.println("Por favor, introduzca los minutos: ");
	  
	  minutos = Integer.parseInt(System.console().readLine());
	  
	  int totSumMin;
	  
	  totSumMin = (hora * 3600) + (minutos * 60);
	  
	  System.out.println("Le quedan " + (86400 - totSumMin) + " segundos");
  }
}
	  
	  

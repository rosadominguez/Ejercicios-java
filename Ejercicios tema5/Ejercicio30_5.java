public class Ejercicio30_5{
  public static void main(String [] args) {
    System.out.println("Este programa indicara la diferencia entre horas de dos dias diferentes");
    
    int dia1;
    int hora1;
    int dia2;
    int hora2;
    int contador = 0;
    
    System.out.println("Introduzca el numero corresponiente (1 - 7 ) del primer dia ( de lunes a domingo)");
    dia1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca la hora del primer dia (0-24)");
    hora1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el numero corresponiente (1 - 7 ) del segundo dia ( de lunes a domingo)");
    dia2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca la hora del segundo dia (0 - 24 )");
    hora2 = Integer.parseInt(System.console().readLine());
    
    int faltan1 = 24 - hora1;
		
		while (dia1 < dia2){
			contador++;
			dia1++;
		}
		int falta = faltan1 + hora2 + ((contador - 1) *24);
		
		System.out.println("La diferencia es de " + falta + " horas");
    } 
  }
		
  


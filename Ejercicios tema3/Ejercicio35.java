import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args){
	  
	  System.out.println("Este programa calcula el area de un rectangulo");
	  
      double base;
	  double altura;
	  double area;
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("introduzca la base");
	  
	  base = Double.parseDouble(escanerEntrada.nextLine());
	  
	  System.out.println("introduzca la altura");
	  
	  altura = Double.parseDouble(escanerEntrada.nextLine());
	  
	  area = base * altura;
	  
	  System.out.println("el area del rectangulo es  "+ base+ " x " + altura + " = " + area);
  }
 }
	    
	   
	    
	    
	  

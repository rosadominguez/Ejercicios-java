import java.util.Scanner;

public class Ejercicio361 {
  public static void main(String[] args){
	  
	  System.out.println("Calcule el area de su triangulo");
	  
      double base;
	  double altura;
	  double mitad;
	  mitad = 2;
	  double area;
	  
	
	  
	  Scanner escanerEntrada = new Scanner(System.in);
	  	  
	  System.out.println("introduzca la base");
	  
	  base = Double.parseDouble(escanerEntrada.nextLine());
	  
	  System.out.println("introduzca la altura");
	  
	  altura = Double.parseDouble(escanerEntrada.nextLine());
	  
	  area = (base * altura)/mitad;
	  
	  
	  System.out.println("el area del triangulo es  " + "(" + base+ " x " + altura + ")" + " / " + mitad + " = " + area);
  }
 }

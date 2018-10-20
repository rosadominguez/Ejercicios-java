public class Ejercicio18_5 {
  public static void main(String [] args) {
  
      System.out.println("Este programa dira los numero enteros comprendidos entre dos, de 7 en 7");
      
      int num1;
      int num2;
      int aux =0;
      
      System.out.println("Introduzca el primer numero: ");
      num1 = Integer.parseInt(System.console().readLine());
      System.out.println("Introduzca el segundo numero: ");
      num2 = Integer.parseInt(System.console().readLine());
      
         if (num1 == num2){
			System.out.println("Lo siento los numero son iguales.");
		}
		
        if (num1 < num2){
		    while (num1 <= (num2 - 7)) {
			  num1 +=7;
			  System.out.print(num1 + ", ");
		    }
		}
        
        if (num1 > num2) {
		  aux = num1;
		  num1 = num2;
		  num2 = aux;
		  
		      while (num1 <= (num2 - 7)) {
			         num1 +=7;
			         System.out.print(num1 + ", ");
		      }
         }
    }
}
		  
      

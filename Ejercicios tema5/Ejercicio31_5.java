public class Ejercicio31_5 {
  public static void main(String [] args) {
    System.out.println("Este programa dibujara una L de la altura que indique el usuario");
    
    int altura =0;
     
    System.out.println("Por favor, introduzca la altura (numero entero positivo)");
    altura = Integer.parseInt(System.console().readLine());
    
     int horizontal = (altura / 2) + 1;
     
    for ( int i = 1;i < altura;i++) {
        System.out.println("*");
    }
    
    
    for (int i = 1;i <=horizontal; i++) {
        System.out.print("*");
    }
   }
 }
    

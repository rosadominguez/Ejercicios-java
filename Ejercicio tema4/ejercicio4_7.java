public class ejercicio4_7 {
  public static void main(String [] args) {
  
    System.out.println("Este programa calcula la media de 3 notas");
    
    double num1;
    double num2;
    double num3;
    
    System.out.println("Introduzca la primera nota");
    num1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la segunda nota");
    num2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la tercera nota");
    num3 = Double.parseDouble(System.console().readLine());
    
    System.out.printf("La media de los tres numeros es: " + (( num1 * num2 * num3)/3));
  }
}

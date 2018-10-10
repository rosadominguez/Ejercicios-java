public class ejercicio4_6 {
  public static void main(String [] args) {
  
    double altura;
    
    System.out.println("Estre programa calcula el tiempo que tarda en caer un objeto desde una altura dada");
    System.out.println("Introduzca la altura en metros");
    altura = Double.parseDouble(System.console().readLine());
    
    double tiempo = Math.sqrt(2 * altura / 9.81);
    
    System.out.println("El tiempo que tarda en caer es de: " + tiempo);
    
  }
 }

public class Ejercicio5 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[034m";
    String morado = "\033[035m";
    String blanco = "\033[037m";
  
    System.out.print("Lunes  Martes  Miercoles  Jueves  Viernes");
    System.out.println(azul + "SINF"     + naranja + "PRO"     + verde + "EED"       + verde + "EDD"    + azul + "SINF");
    System.out.println(azul + "SINF"     + naranja + "PRO"     + morado + "LM"        + naranja + "PRO"   + azul + "SINF");
    System.out.println(azul + "SINF"     + naranja + "PRO"     + morado + "LM"        + naranja + "PRO"   + azul + "SINF");
    System.out.println(rojo + "FOL"     + blanco + "BBDD"    + naranja + "PROG"      + blanco + "BBDD"   + verde + "EDD");
    System.out.println(rojo + "FOL"     + blanco + "BBDD"    + naranja + "PROG"      + blanco + "BBDD"    + morado + "LM");
    System.out.println(rojo + "FOL"     + blanco + "BBDD"    + naranja + "PROG"      + blanco + "BBDD"    + morado + "LM");
  }
}

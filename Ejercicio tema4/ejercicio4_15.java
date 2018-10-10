public class ejercicio4_15 {
  public static void main(String [] args) {
  
    System.out.println("Este programa dibuna una piramide");
    System.out.println("Elija un relleno para la piramide");
    String r = System.console().readLine();
    System.out.println("Elija un caso para dibujar una piramide como prefieras");
    System.out.println("1- Piramide con vertice hacia arriba");
    System.out.println("2- Piramide con vertice hacia abajo");
    System.out.println("3- Piramide con vertice hacia derecha");
    System.out.println("4- Piramide con vertice hacia izquierda");
    
    int numero;
    numero = Integer.parseInt(System.console().readLine());
    
    
    switch (numero){
    
    case 1:
               System.out.println("     "+ r);
               System.out.println("    " + r + r + r);
               System.out.println("   " + r + r + r + r + r);
               System.out.println("  " + r + r + r + r + r + r + r);
     break;
    
    case 2:
               System.out.println("  " + r + r + r + r + r + r + r);
               System.out.println("   " + r + r + r + r + r);
               System.out.println("    " + r + r + r);
               System.out.println("     "+ r);
     break;
    
    case 3:
               System.out.println(r);
               System.out.println("  " + r);
               System.out.println("     " + r);
               System.out.println("        " + r);
               System.out.println("     "+ r);
               System.out.println("  "+ r);
               System.out.println(r);
     break;
     
     case 4:
               System.out.println("              " + r);
               System.out.println("          "+ r);
               System.out.println("     " + r);
               System.out.println(" " + r);
               System.out.println("      "+ r);
               System.out.println("          "+ r);
               System.out.println("              " + r);
   }
  }
}
    
    

public class ejercicio26 {
  public static void main(String[] args) {
    
    int preArt = 1500;
    double basIva = 0.21;
    double totFac;
    totFac = preArt * (double)basIva;
    
    System.out.println("El articulo cuesta  " + preArt + "€");
    System.out.println("Más el  " + basIva + "% IVA");
    System.out.println("La factura es un total de  " + totFac + "€"); 
  }
}

 public class Ejercicio37 {
  public static void main(String[] args){
	  
	  System.out.println("Vamos a calcular el total de su factura");
	  
	  System.out.print("Por favor, introduzca la base imponible(precio del articulo sin IVA)\n");
	  
	  double baseImponible = Double.parseDouble(System.console( ).readLine( ));
	  
	  System.out.println("Base imponible  " + baseImponible);
	  System.out.println("IVA              " + baseImponible * 0.21);
	  System.out.println("----------------");
	  System.out.println("TOTAL            " + baseImponible * 1.21);
	  
	}
}

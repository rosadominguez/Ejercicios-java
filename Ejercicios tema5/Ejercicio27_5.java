public class Ejercicio27_5 {
  public static void main(String [] args) {
    System.out.println("Este programa calcula los multiplos de 3 del 1 hasta el numero introducido");
    
    int numero;
    int x = 0;
    int suma = 0;
    int contador = 0;
  
    
    System.out.println("Introduzca el numero en el que quiere que termine la serie");
    numero = Integer.parseInt(System.console().readLine());
    System.out.println("Los multiplos son: ");
    
     while (x <= numero){
		     x++;
		if (x%3 == 0){
			suma = suma + x;
			System.out.println(x);
			contador++;
		}
	}
    System.out.println("Son: " + contador + " y la suma de ellos es " + suma+ ".");
 }
}

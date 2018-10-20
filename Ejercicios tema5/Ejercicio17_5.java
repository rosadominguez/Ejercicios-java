public class Ejercicio17_5 {
  public static void main(String [] args) {
    
    System.out.println("Este programa suma los 100 numeros siguientes al introducido.");
    
    int numero;

    System.out.println("Introduzca un numero entero y le dire la suma de los 100 siguientes");
    numero = Integer.parseInt(System.console().readLine());
    int numeroSiguiente = numero + 100;
    int suma = 0;
    numero = numero + 1;
    
    while (numero <= numeroSiguiente) {
        suma = suma + numero; 
        numero++;
    }
    
    System.out.println("La suma de todos los numero es " + suma);
    
    }
  } 
  
        
    
    
    

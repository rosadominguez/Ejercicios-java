public class Ejercicio8_5 {
  public static void main(String [] args) {
  
  int numTabla = 0;
  int numMult;
  int producto = 0;
  
    System.out.println("Tabla de multiplicar");
    System.out.println("Indique el numero de la tabla que desea conocer: ");
    numTabla = Integer.parseInt(System.console().readLine());
   
   for(numMult = 0; numMult <= 10; numMult++) {
      producto = numTabla * numMult;
      System.out.println(numTabla + " * " + numMult + " = " + producto);
   }
  }
 }

public class Ejercicio5_6 {
  public static void main(String [] args) {
  
       //Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
       //separados por espacios. Muestra también el máximo, el mínimo y la media
       //de esos números.
       
       System.out.println("Vamos a mostrar 50 numeros aleatorios entre 100 y 199");
       
       int numero;
       int minimo= 199;
       int maximo = 0;
       int media= 0;
       int aux = 0;
       int aux1 = 0;
       int aux2 = 0;
       int suma = 0;
       int contador = 0;
       
           System.out.print("Los numeros son ");
       
       for(int i = 0; i < 50; i++){
		   
		   numero = (int)(Math.random()*100)+100;
			aux = numero;
		   System.out.print(numero + (" "));
		   suma = suma + numero;
		   
		     if (aux > maximo){
				 maximo = aux;
			 }
			 if (aux < minimo){
				 minimo = aux;
			 }
			 contador++;
		 }
		 System.out.println(" ");
		 System.out.println("La media de los numeros es " + (suma/contador) + (" el minimo ") + minimo + (" y el maximo ") + maximo);
	 }
 }
	 
		   

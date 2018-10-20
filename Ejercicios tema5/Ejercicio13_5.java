public class Ejercicio13_5 {
  public static void main(String []args){
  
  System.out.println("De una lista de 10 numero dira cuantos son positivos y cuantos negativos");
  
  int numero;
  int positivo = 0;
  int negativo = 0;
  
  System.out.println("Por favor, introduzca 10 numero (positivos o negativos)");
  
    for (int contador = 0; contador<10;contador++) {
	  
	  numero = Integer.parseInt(System.console().readLine());
	  
	  if (numero >= 0) {
		  positivo++;
	  }else{
		  negativo++;
      }
    }
  System.out.println("Has introducido " + positivo + " numeros positivos y " + negativo + " numeros negativos");
  }
}

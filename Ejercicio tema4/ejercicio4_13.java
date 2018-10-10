public class ejercicio4_13 {
  public static void main(String[] args) {
  
  int aux;
  
    System.out.println("Este programa ordena tres numeros enteros");
    System.out.println("Introduzca cada numero pulsando intro en cada uno");
    int num1 = Integer.parseInt(System.console().readLine());
    int num2 = Integer.parseInt(System.console().readLine());
    int num3 = Integer.parseInt(System.console().readLine());

  if (num1 > num2){
	  aux = num1;
	  num1 = num2;
	  num2 = aux;
  }
  if (num2 > num3){
	  aux = num2;
	  num2 = num3;
	  num3 = aux;
  }
  if (num1 > num2){
	  aux = num1;
	  num1 = num2;
	  num2 = aux;
  }
    System.out.println("Los numeros quedan ordenados asi:" + num3 + " , " + num2 + " y " + num1);
  }
}

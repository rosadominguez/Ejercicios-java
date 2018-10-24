public class Ejercicio37_5 {
  public static void main(String [] args) {
  
  //Realiza un conversor del sistema decimal al sistema de palotes.
  
  int numero;
  int resto = 0;
  String num = "";
  int digito = 0;

  
  System.out.println("Por favor, introduzca un numero entero: ");
  numero = Integer.parseInt(System.console().readLine());
  while( numero>0) {
	  resto = (resto*10) + (numero%10);
	  numero = numero/10;

       }
      System.out.print("");
      
  
  while (resto > 0) {
  
  digito = (int)(resto%10);
  
  switch (digito){
	  
	  case 1:
	  num = " | ";
	  break;
	  
	  case 2:
	  num = " || " ;
	  break;
	  
	  case 3:
	  num = " ||| " ;
	  break;
	  
	  case 4:
	  num = " |||| " ;
	  break;
	  
	  case 5:
	  num = " ||||| " ;
	  break;
	  
	  case 6:
	  num = " |||||| " ;
	  break;
	  
	  case 7:
	  num = " ||||||| " ;
	  break;
	  
	  case 8:
	  num = " ||||||||| " ;
	  break;
	  
	  case 9:
	  num = " ||||||||| " ;
	  break;
	  
	  case 0:
	  num = " " ;
	  break;
	  
  }
   System.out.print(" -" + num);
   resto = resto /10;
   
}
    System.out.println(" ");
}
}

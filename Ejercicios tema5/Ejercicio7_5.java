public class Ejercicio7_5 {
  public static void main(String [] args) {
  
  int claveSeg = 9999;
  int clave;
  int contador = 0;
  int intento = 0;
  int maxIntentos = 4;
  
  System.out.println("Clave de la caja fuerte");
   
   do {
	    System.out.println("Introduzca la clave de 4 digitos,recuerde que dispone de 4 intentos.");
        clave = Integer.parseInt(System.console().readLine());
        intento++;
	   if (claveSeg == clave){
		   System.out.println("Caja ABIERTA"); 
	  } else if (intento == 1) { 
		   System.out.println("Primer intento INCORRECTO,vuelva a introducir la clave de 4 digitos");
	  } else if (intento == 2) { 
		   System.out.println("Segundo intento INCORRECTO,vuelva a introducir la clave de 4 digitos");
	  }else if (intento == 3) { 
		   System.out.println("Tercer intento INCORRECTO,vuelva a introducir la clave de 4 digitos");
	  }else if (intento == 4) { 
		   System.out.println("Cuarto intento,lo siento caja BLOQUEADA.");
	  }
	  
	   contador++;
	  }
   while ((contador < maxIntentos) && (clave != claveSeg)); // tengo que cerrar el bucle al encontrar la clave,por eso pongo el distinto a 9999.
   
  }
 }
	   

   
   
  

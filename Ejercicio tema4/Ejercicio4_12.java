public class Ejercicio4_12 {
  public static void main(String [] args) {
  
  int puntos = 0;
  int respuesta;
 
  System.out.println("¿Que sabes del curso?");
  System.out.println("India a o b segun la respuesta que creas correcta");

  System.out.println("1 - En programación,que lenguaje estamos utilizando?");
  System.out.println(" 1 - Java");
  System.out.println(" 2 - C++");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 1) {
	   puntos++;

   }
   
  System.out.println("2 - ¿Tenemos que hacer un trabajo para Sistemas Informaticos?");
  System.out.println(" 1 - No");
  System.out.println(" 2 - Si");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 2) {
	   puntos ++;
   }
   

  System.out.println("3 - ¿En Lenguaje de Marcas,la profesora se llama?");
  System.out.println(" 1 - Pilar");
  System.out.println(" 2 - Eva");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 1) {
	   puntos++;
   }
  
  System.out.println("4 - ¿Tenemos programacion 3 dias a la semana");
  System.out.println(" 1 - Si");
  System.out.println(" 2 - No");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 1) {
	   puntos++;
   }
   
  System.out.println("5 - ¿El profesor de programacion se llama Manuel");
  System.out.println(" 1 - No");
  System.out.println(" 2 - Si");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 1) {
	   puntos++;
   }
   
  System.out.println("6 - ¿Tenemos programacion 8 horas a la semana?");
  System.out.println(" 1 - No");
  System.out.println(" 2 - Si");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 2) {
	   puntos++;
   }
   
  System.out.println("7 - ¿En Lenguaje de Marcas,que estamos utilizando?");
  System.out.println(" 1 - Html");
  System.out.println(" 2 - otro");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 1) {
	   puntos++;
   }
   
  System.out.println("8 - ¿Tenemos la asignatura de FOL los lunes?");
  System.out.println(" 1 - No");
  System.out.println(" 2 - Si");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 2) {
	   puntos++;
   }
  
   
  System.out.println("9 - Los viernes tenemos Sistemas y Lenguaje de Marcas?");
  System.out.println(" 1 - Si");
  System.out.println(" 2 - No");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 1) {
	   puntos++;
   }
   
  System.out.println("10 - ¿El jueves tenemos Entorno de Desarrollo?");
  System.out.println(" 1 - No");
  System.out.println(" 2 - Si");
   respuesta = Integer.parseInt(System.console().readLine());
   if (respuesta == 2) {
	   puntos++;
   }
   
   System.out.println("Has obtenido " + puntos + " puntos");
  
 }
}
  

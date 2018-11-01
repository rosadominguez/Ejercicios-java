public class Ejercicio10_6 {
  public static void main(String [] args) {
  

	//Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
	//El carácter con el que se pinta cada línea se elige de forma aleatoria
	//entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
	//aleatoria entre 1 y 40 caracteres.
	
	System.out.println("Vamos a pintar caracteres en 10 lineas");
	int numero;
	int caracter;
	String dibujo = " ";
	
	for ( int i = 0; i < 10; i++){
		
		numero = (int)(Math.random()*40)+1;
		caracter = (int)(Math.random()*6)+1;
	      
	      while ( 0 < numero) {
			  
			  switch (caracter){
				  
				  case 1:
				  dibujo = "*";
				  break;
				  
				  case 2:
				  dibujo = "-";
				  break;
				  
				  case 3:
				  dibujo = "=";
				  break;
				  
				  case 4:
				  dibujo =".";
				  break;
				  
				  case 5:
				  dibujo ="|";
				  break;
				  
				  case 6:
				  dibujo = "@";
				  break;
			   }
			   
			   System.out.print(dibujo);
			   numero--;
			}
		   System.out.println(" ");
		}
	}
}						  

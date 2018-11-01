public class Ejercicio22_6 {
  public static void main(String [] args) {
  
	//Realiza un programa que pinte por pantalla una serpiente con un serpenteo
	//aleatorio. La cabeza se representará con el carácter @ y se debe colocar
	//exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
	//el cuerpo irá serpenteando de la siguiente manera: se generará de forma
	//aleatoria un valor entre tres posibles que hará que el siguiente carácter se
	//coloque una posición a la izquierda del anterior, alineado con el anterior o una
	//posición a la derecha del anterior. La longitud de la serpiente se pedirá por
	//teclado y se supone que el usuario introducirá un dato correcto.
	
	System.out.println("Vamos a dibujar una serpiente");
	
	int longitud;
	int contador = 0;
	int espacio = 13;
	
	System.out.println("Por favor introduce la longitud de la serpiente contando la cabeza");
		longitud = Integer.parseInt(System.console().readLine());
	
	System.out.print("            @");
	System.out.println("");
	
	while (contador < (longitud - 1)){
	
	     espacio += (int)(Math.random()*3)-1;
	     
	     for(int i = 1; i < espacio;i++){
			System.out.print(" ");
		 }
	        System.out.print("*");
	        System.out.println(" ");
	     contador++;
	}
}
}

	

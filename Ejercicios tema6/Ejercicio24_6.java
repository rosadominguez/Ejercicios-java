public class Ejercicio24_6 {
  public static void main(String [] args) {
  
	//Escribe un programa que, dado un número introducido por teclado, elija al azar
	//uno de sus dígitos.
	
	long numIntro;
	long numero= 0;
	int posicion = 0;
	int contador = 1;
	long numPosicion = 0;
	
	System.out.println("Por favor, introduce un numero entero");
	numIntro = Long.parseLong(System.console().readLine());
	
	numero = numIntro;
	
		while ((numero/10)>0){
			contador++;
			numero = numero/10;
		}
		//System.out.println(contador);
		
		posicion = (int)(Math.random()*(contador))+1;
	
			for(int i = 0; i <= posicion;i++){
				numPosicion = numIntro%10;
				numIntro = numIntro/10;
			}
    
		System.out.println("El numero de la posicion "+ (posicion+1)+ " es el " + numPosicion);
	}
}

public class Ejercicio34_5 {
  public static void main(String [] args) {
  
	//Escribe un programa que pida dos números por teclado y que luego mezcle en
		//dos números diferentes los dígitos pares y los impares. Se van comprobando
		//los dígitos de la siguiente manera: primer dígito del primer número, primer
		//dígito del segundo número, segundo dígito del primer número, segundo
		//dígito del segundo número, tercer dígito del primer número… Para facilitar
		//el ejercicio, podemos suponer que el usuario introducirá dos números de la
		//misma longitud y que siempre habrá al menos un dígito par y uno impar.
		
        int num1;
        int num2;
        int longitud = 0;
        
		System.out.println("Por favor introduzca un numero entero");
		num1 = Integer.parseInt(System.console().readLine());
		System.out.println("Por favor introduzca otro numero entero");
		num2 = Integer.parseInt(System.console().readLine());
		
			int numero = num1;
			int mun1 = 0;
		
		
			while ( numero > 0) {
				mun1 = (mun1*10) + (numero%10);
				longitud++;
				numero = numero/10;
			}
		
			numero = num2;
			int mun2 = 0;
		
			while ( numero > 0) {
				mun2 = (mun2*10) + (numero%10);
				numero = numero/10;
				
			}
		
				int pares = 0;
				int impares = 0;
				int digito;
		
				for (int i = 0; longitud > i; i++){
			
				digito = (int)(mun1%10);
	         
					if ( digito%2 == 0){
						pares = pares*10 + digito;
					} else {
						impares = impares*10 + digito;
					}
			 
				digito = (int)(mun2%10);
				
					if ( digito%2 == 0){
						pares = pares*10 + digito;
					} else {
						impares = impares*10 + digito;
					}
			 
					mun1 = mun1/10;
					mun2 = mun2/10;
			 
			}
			
		System.out.println("Los numero pares son " + pares);
	    System.out.println("Los numero impares son " + impares);
	}
}
		        
		        

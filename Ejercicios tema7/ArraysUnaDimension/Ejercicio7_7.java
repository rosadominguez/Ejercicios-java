public class Ejercicio7_7 {
  public static void main(String [] args){
  
	//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
	//muestre por pantalla separados por espacios. El programa pedirá entonces
	//por teclado dos valores y a continuación cambiará todas las ocurrencias del
	//primer valor por el segundo en la lista generada anteriormente. Los números
	//que se han cambiado deben aparecer entrecomillados.
	
	System.out.println("Vamos a mostrar numeros");
	
	int numIntro1;
	int numIntro2;
	int [] numero = new int [100];
	
	for(int i = 0;i<100;i++){
		
	numero[i] = (int)(Math.random()*21);
	System.out.print(numero[i] + " ");
	
    }
    System.out.println(" ");
    System.out.println("Por favor, introduce un numero que quieras cambiar del 0 al 20");
    numIntro1 = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora introduce el numero por el que quieras cambiarlo del 0 al 20");
    numIntro2 = Integer.parseInt(System.console().readLine());
    
    for(int i = 0;i<100;i++){
		
		if(numero[i] == numIntro1){
			System.out.print(numIntro2 + " ");
		}else{
			System.out.print(numero[i] + " ");
		}
	}
  }
}
